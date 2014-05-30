package com.bttw.address.test;

import java.util.Map;

import com.bttw.address.src.AddressPartsEnum;
import com.bttw.address.src.IEAddressParser;

public class IEAddressTest {

	 public static void main(String[] args){
		  String addr1 = "123 millmount road, drogheda, Meath 12345";
		  Map<AddressPartsEnum, String> addressComponents =  IEAddressParser.parseRaw(addr1);
		  
		 String zip = addressComponents.get(AddressPartsEnum.ZIP);
	     String city = addressComponents.get(AddressPartsEnum.CITY);
	     String county = addressComponents.get(AddressPartsEnum.COUNTY);
	     String number = addressComponents.get(AddressPartsEnum.NUMBER);
	     String street = addressComponents.get(AddressPartsEnum.STREET);
	     System.out.println(zip);
	     System.out.println(city);  
	     System.out.println(county);
	     System.out.println(number);
	     System.out.println(street);
	  }
	
}
