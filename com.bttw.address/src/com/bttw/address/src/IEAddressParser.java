package com.bttw.address.src;



import static com.bttw.address.src.AddressPartsEnum.COUNTY;
import static com.bttw.address.src.AddressPartsEnum.LINE2;
import static com.bttw.address.src.AddressPartsEnum.PREDIR;
import static com.bttw.address.src.AddressPartsEnum.STREET;
import static com.bttw.address.src.AddressPartsEnum.TYPE;
import static com.bttw.address.src.AddressPartsEnum.valueOf;
import static com.bttw.address.src.AddressRegexLibrary.P_CORNER;
import static com.bttw.address.src.AddressRegexLibrary.P_CSZ;
import static com.bttw.address.src.AddressRegexLibrary.P_INTERSECTION;
import static com.bttw.address.src.AddressRegexLibrary.P_STREET_ADDRESS;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bttw.address.src.AddressPartsEnum;

public class IEAddressParser{

  private static final Pattern CORNER = Pattern.compile(P_CORNER.getRegex());
  private static final Pattern STREET_ADDRESS = Pattern.compile(P_STREET_ADDRESS.getRegex());
  private static final Pattern CSZ = Pattern.compile(P_CSZ.getRegex());
  private static final Pattern INTERSECTION = Pattern.compile(P_INTERSECTION.getRegex());
  private static final Pattern CLEANUP = Pattern.compile("^\\W+|\\W+$|[\\s\\p{Punct}&&[^\\)\\(#&,:;@'`-]]");
  private static final Pattern STREET_TYPES = Pattern.compile(RegexLibrary.STREET_DESIGNATOR);
  private static final Pattern COUNTIES = Pattern.compile(RegexLibrary.COUNTIES);
  
  
  /**
   * Parses a raw address string 
   * @param rawAddr
   * @param autoCorrectStateSpelling swith on/off auto correction on state mis-spelling
   * @return a map of parsed address components
   */
  public static Map<AddressPartsEnum, String> parseRaw(String rawAddr){
    rawAddr = tidyString(rawAddr);
    
    Matcher m = STREET_ADDRESS.matcher(rawAddr);
    Map<AddressPartsEnum, String> ret = null;
    if(m.matches()){
      ret = getAddressMap(m, P_STREET_ADDRESS.getNamedGroupMap());
      postProcess(ret);
      String splitRawAddr = null;
      String line12sep = ret.get(AddressPartsEnum.TLID);//HACK!
      if(!line12sep.contains(",") 
          && (splitRawAddr = designatorConfusingCitiesCorrection(ret, rawAddr))!=null){
        m = STREET_ADDRESS.matcher(splitRawAddr);
        if(m.matches()){
          ret = getAddressMap(m, P_STREET_ADDRESS.getNamedGroupMap());
          ret.remove(AddressPartsEnum.TLID);//HACK!
          return ret;
        }
      }
      ret.remove(AddressPartsEnum.TLID);//HACK!
    }
    m = CORNER.matcher(rawAddr);
    if(ret == null && m.find()){
      m = INTERSECTION.matcher(rawAddr);
      if(m.matches()){
        ret = getAddressMap(m, P_INTERSECTION.getNamedGroupMap());
      }
    }
    
    if(ret == null){
      m = CSZ.matcher(rawAddr);
      if(m.matches()){
        ret = getAddressMap(m, P_CSZ.getNamedGroupMap());
      }
    }
    return ret;
  }
  
  
  private static void postProcess(Map<AddressPartsEnum, String> m){
    //these are (temporary?) hacks...
    if(m.get(TYPE) == null && m.get(STREET)!= null 
            && STREET_TYPES.matcher(m.get(STREET).toUpperCase()).matches()){
      m.put(TYPE, m.get(STREET));
      m.put(STREET, m.get(PREDIR));
      m.put(PREDIR, null);
    }
    if(m.get(COUNTY) == null && m.get(LINE2)!= null 
            && COUNTIES.matcher(m.get(LINE2).toUpperCase()).matches()){
      m.put(COUNTY, m.get(LINE2));
      m.put(LINE2, null);
    }
  }
  
  private static Map<AddressPartsEnum, String> getAddressMap(Matcher m, Map<Integer, String> groupMap){
    Map<AddressPartsEnum, String> ret = new EnumMap<AddressPartsEnum, String>(AddressPartsEnum.class);
    for(int i=1; i<= m.groupCount(); i++){
      String name = groupMap.get(i);
      AddressPartsEnum comp = valueOf(name);
      if(ret.get(comp) == null){
        putIfNotNull(ret, comp, m.group(i));
      }
    }
    return ret;
  }
  
  private static void putIfNotNull(Map<AddressPartsEnum, String> m , AddressPartsEnum ac, String v){
    if(v != null)
      m.put(ac, v);
  }

  
  
  // needs to be more documented here
  private static Pattern STREET_DESIGNATOR_CHECK = Pattern.compile("\\b(?i:(?:"+RegexLibrary.STREET_DESIGNATOR+"))\\b");
 
  private static String designatorConfusingCitiesCorrection(Map<AddressPartsEnum, String> parsedLocation, String input){
    String street = parsedLocation.get(AddressPartsEnum.STREET);
    String type = parsedLocation.get(AddressPartsEnum.TYPE);
    String line2 = parsedLocation.get(AddressPartsEnum.LINE2);
    if(street == null || type == null || line2 != null || street.split(" ").length < 2){ return null;}
	  Matcher m = STREET_DESIGNATOR_CHECK.matcher(street);
	  if(m.find()){
		  String parsedstate = parsedLocation.get(AddressPartsEnum.COUNTY);
		  if(parsedstate == null){
			  String parsedcity = parsedLocation.get(AddressPartsEnum.CITY);
			  if(parsedcity != null && parsedcity.length() == 2){
				  parsedstate = parsedcity;
			  }
		  }
	//	  String normalizedState = AddressStandardizer.normalizeState(parsedstate.toUpperCase());
		  String inputUpper =  input.toUpperCase();
		  String ret = null;
		  Set<String> stateSet = new HashSet<String>();
		  if(parsedstate != null){
			  stateSet.add(parsedstate);
		  }else{ //if no state in put, this needs to work much harder
			 // stateSet.addAll(SpecialData.C_MAP.keySet());
		  }
		  int stateIdx = parsedstate == null ? input.length() : input.lastIndexOf(parsedstate);
		  for(String state : stateSet){
		    //  for(String s : SpecialData.C_MAP.get(state)){
			        int idx = -1;
			  //      if((idx =inputUpper.lastIndexOf(s))!=-1){ //and the input has one of the city names that can confuse the parser
			          //this almost guaranteed to break the parser, help the parser by putting a comma separator before the city
			    //    	if(idx+s.length() >= stateIdx -2){
			        		return input.substring(0, idx)+","+input.substring(idx);
			      //  	}
			        //}
			    //  }
		  }
	      return ret;
	  }		
  return null;
    
  }
  
  private static String tidyString(String rawAddr){
	    return CLEANUP.matcher(rawAddr).replaceAll(" ").replaceAll("\\s+", " ").trim();
	  }
	
}