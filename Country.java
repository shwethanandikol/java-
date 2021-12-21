package com.xworkz.maping;

import java.util.Map;
import java.util.*;

public class Country {
 
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
	
	
	map.put("Asia",48);
	map.put("Africa",54);
	map.put("North America",23);
	map.put("South America",14);
	map.put("Antarctica",7);
	map.put("Europe",44);
	map.put("Australia",7);
	
	System.out.println(map.size());
	Integer value=map.get("Europe");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Asia");
	System.out.println(contains);
	
	contains=map.containsValue(48);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	});
	
}
}
