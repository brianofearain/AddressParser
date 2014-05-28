package com.bttw.address;

import static com.bttw.address.Data.getCOUNTIES_MAP;
import static com.bttw.address.Data.getDIRECTIONAL_MAP;
import static com.bttw.address.Data.getSTREET_TYPE_MAP;
import static com.bttw.address.Data.getUNIT_MAP;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

/**
 * Some common regex, they are for address parsing, not for validating English, some 
 * common spelling mistakes are intentionally included 
 * 
 *
 *
 */
class RegexLibrary{
  
  ///////////////NUMBERS///////////////
  
  public static String TXT_NUM_0_9 = 
    "zero|one|two|three|four|five|six|seven|eight|nine";
  public static String TXT_NUM_10_19 = 
    "ten|eleven|twelve|thirteen|fourteen|fifteen|sixteen|seventeen|eighteen|nineteen";

  private static final String ORDINAL_0_9 = 
    "0[-]?th|1[-]?st|2[-]?nd|3[-]?rd|[0[4-9]][-]?th|1[0-9][-]?th";
  
  private static final String TXT_ORDINAL_1_9 = 
    "first|second|third|fourth|forth|fifth|sixth|seventh|eighth|ninth|nineth";  
  private static final String TXT_ORDINAL_10_19 = 
    "tenth|eleventh|twelfth|twelveth|twelvth|thirteenth|fourteenth|fifteenth|sixteenth|seventeenth|enghteenth|nineteenth";

  public static String TXT_NUM_0_19 = 
      "(?:"+TXT_NUM_0_9+")" +
    "|" +
      "(?:"+TXT_NUM_10_19+")";

  //XXX not necessary valid english grammar, but it's okay
  public static final String ORDINAL_ALL = "(?:[0-9]*(?:"+ORDINAL_0_9+"))";

  public static final String TXT_ORDINAL_0_19 =
    "zeroth" +
  "|" +
    "(?:"+TXT_ORDINAL_1_9+")" +
  "|" +
    "(?:"+TXT_ORDINAL_10_19+")";  
  
  /////////////NUMBERS///////////////

  /////////////IE ADDRESSES///////////////
  
  public static final String STREET_DESIGNATOR = IEAddressesData.getStreetDesignatorRegex();
  public static final String COUNTIES = IEAddressesData.getCountyRegex();
  public static final String DIRECTIONS = IEAddressesData.getDirectionRegex();
  public static final String ADDR_UNIT =  IEAddressesData.getUnitDesignatorRegex();
  
  @SuppressWarnings("unchecked")
  private static class IEAddressesData{    
    public static String getDirectionRegex(){
      String abbrv = "N[ ]?E|S[ ]?E|S[ ]?W|N[ ]?W|N|S|E|W";
      return join("|", getDIRECTIONAL_MAP().keySet())+"|"+abbrv;
    }
    
    public static String getCountyRegex(){
      return join("|", getCOUNTIES_MAP().values(), getCOUNTIES_MAP().keySet());
    }
    
    public static String getStreetDesignatorRegex(){
      return join("|", getSTREET_TYPE_MAP().values(), getSTREET_TYPE_MAP().keySet());
    }
    
    public static String getUnitDesignatorRegex(){
      return join("|", getUNIT_MAP().values(), getUNIT_MAP().keySet());
    }
    
    private static String join(String separator, Collection<String>...collections){
      Set<String> union = new HashSet<String>();
      for(Collection<String> c : collections){
        union.addAll(c);      
      }
      String[] set = new String[union.size()];
      List<String> lst = Arrays.asList(union.toArray(set));
      Collections.sort(lst, new Comparator<String>(){
        public int compare(String o1, String o2) {
          return Integer.valueOf(o2.length()).compareTo(o1.length());
        }
      });
      return StringUtils.join(lst, separator);
    }
  }
  
}