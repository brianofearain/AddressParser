package com.bttw.address.src;
import static com.bttw.address.src.RegexLibrary.ADDR_UNIT;
import static com.bttw.address.src.RegexLibrary.COUNTIES;
import static com.bttw.address.src.RegexLibrary.DIRECTIONS;
import static com.bttw.address.src.RegexLibrary.ORDINAL_ALL;
import static com.bttw.address.src.RegexLibrary.STREET_DESIGNATOR;
import static com.bttw.address.src.RegexLibrary.TXT_NUM_0_9;
import static com.bttw.address.src.RegexLibrary.TXT_NUM_10_19;
import static com.bttw.address.src.RegexLibrary.TXT_ORDINAL_0_19;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 
public class AddressRegexLibrary{
  
  public static final String NUMBER =
    "(?:\\p{Alpha})?\\d+(?:[- ][\\p{Alpha}&&[^NSEW]]" +
    "(?!\\s+(?:st|street|ave|aven|avenu|avenue|blvd|boulv|boulevard|boulv|plz|plaza|plza)))?" +
    "|\\d+-?\\d*(?:-?\\p{Alpha})?|"+TXT_NUM_0_9+"|" +TXT_NUM_10_19; 
  
  public static final String FRACTION = "\\d+\\/\\d+";
  
  public static final String LINE1A = 
    "(?P<street>"+DIRECTIONS+")\\W+" + 
    "(?P<type>"+STREET_DESIGNATOR+")\\b";
  
  public static final String LINE1B = 
    "(?:(?P<predir>"+DIRECTIONS+")\\W+)?" +
    "(?:" +
      "(?P<street>[^,]+)" +
      "(?:[^\\w,]+(?P<type>"+STREET_DESIGNATOR+")\\b)" +
      "(?:[^\\w,]+(?P<postdir>"+DIRECTIONS+")\\b)?" +
     "|" +
       "(?P<street>[^,]*\\d)" +
       "(?:(?P<postdir>"+DIRECTIONS+")\\b)" +
     "|" +
       "(?P<street>[^,]+?)" +
       "(?:[^\\w,]+(?P<type>"+STREET_DESIGNATOR+")\\b)?" +
       "(?:[^\\w,]+(?P<postdir>"+DIRECTIONS+")\\b)?" +       
    ")";
  
  public static final String LINE1A2 = 
    "(?P<street2>"+DIRECTIONS+")\\W+" + 
    "(?P<type2>"+STREET_DESIGNATOR+")\\b";
  
  public static final String LINE1B2 = 
    "(?:(?P<predir2>"+DIRECTIONS+")\\W+)?" +
    "(?:" +
      "(?P<street2>[^,]+)" +
      "(?:[^\\w,]+(?P<type2>"+STREET_DESIGNATOR+")\\b)" +
      "(?:[^\\w,]+(?P<postdir2>"+DIRECTIONS+")\\b)?" +
     "|" +
       "(?P<street2>[^,]*\\d)" +
       "(?:(?P<postdir2>"+DIRECTIONS+")\\b)" +
     "|" +
       "(?P<street2>[^,]+?)" +
       "(?:[^\\w,]+(?P<type2>"+STREET_DESIGNATOR+")\\b)?" +
       "(?:[^\\w,]+(?P<postdir2>"+DIRECTIONS+")\\b)?" +       
    ")";
  
  public static final String LINE1 =
    "(?P<number>(?:" + NUMBER + ")(?:\\W+"+FRACTION+")?)\\W+" + 
    "(?:" + LINE1B + "|" + LINE1A + ")";
  
  //A, 2A, 22, A2, 2-a, 2/a, etc...
  public static final String UNIT_NUMBER = 
    "(?:\\b\\p{Alpha}{1}\\s+|\\p{Alpha}*[-/]?)?" +
    "(?:\\d+|\\b\\p{Alpha}\\b(?=\\s|$))" +
    "(?:[ ]*\\p{Alpha}\\b|-\\w+)?";
  public static final String ZIP = "\\d{5}(?:[- ]\\d{3,4})?";
  public static final String NOT_STATE_OR_ZIP = "(?![^,]*\\W+(?:\\b(?:"+COUNTIES+")\\b(?:\\W*$|(?:"+ZIP+")\\W*$))|(?:\\b(?:"+ZIP+")\\b\\W*$))";
  public static final String LINE2A = "(?:"+ADDR_UNIT+")[s]?\\W*?(?:"+UNIT_NUMBER+")";
  public static final String LINE2A_GROUPED = "("+ADDR_UNIT+")[s]?\\W*?("+UNIT_NUMBER+")";
  public static final String LINE2B = "(?:(?:"+TXT_ORDINAL_0_19+"|"+ORDINAL_ALL+")\\W*(?:"+ADDR_UNIT+")[s]?)";
  public static final String LINE2 = "(?:(?P<line2>"+LINE2A+"|"+LINE2B+"|[^,]*?"+NOT_STATE_OR_ZIP+")\\W+)??";
  
  public static final String LASTLINE = 
    "(?:" +
      "(?P<city>[^\\d,]+?)\\W+" +  //city                                              
      "\\b(?P<county>(?:"+COUNTIES+")\\b)?\\W*" + //state                                          
    ")?" +
    "(?P<zip>"+ZIP+")?";      //zip

  public static final String ADDR_NAME =  "(?:(?P<name>[^,]+)\\W+)??"; 
  
  public static final String STREET_ADDRESS = 
   ADDR_NAME + LINE1 + "(?P<tlid>\\W+)"+ LINE2 + LASTLINE +"\\W*"; //the group name is a hack
  
  public static final String CORNER = "(?:\\band\\b|\\bat\\b|&|\\@)";

  static final Pattern NAMED_GROUP_PATTERN = Pattern.compile("\\(\\?P<(.*?)>");
  
  public static final String INTERSECTION = ADDR_NAME +
  "(?:" + LINE1A + "|" + LINE1B + ")" + "\\W*\\s+" + CORNER + "\\s+" +
  "(?:" + LINE1A2 + "|" + LINE1B2 + ")" + "\\W+" + LASTLINE +"\\W*";
  
  static NamedGroupPattern compile(String regex) {
	    Matcher m = NAMED_GROUP_PATTERN.matcher(regex);
	    Map namedGroupMap = new HashMap();
	    int i = 1;
	    while (m.find()) {
	      namedGroupMap.put(Integer.valueOf(i), m.group(1).toUpperCase());
	      i++;
	    }
	    return new NamedGroupPattern(m.replaceAll("("), namedGroupMap);
	  }
  
  
  public static final NamedGroupPattern P_CSZ = compile("(?i:"+LASTLINE+")");
  public static final NamedGroupPattern P_STREET_ADDRESS = compile("(?i:"+STREET_ADDRESS+")");
  public static final NamedGroupPattern P_INTERSECTION = compile("(?i:"+INTERSECTION+")");
  public static final NamedGroupPattern P_CORNER = compile("(?i:"+CORNER+")");
  

}