package com.xworkz.maping;
import java.util.Map;
import java.util.*;

public class Pincode {
 
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
	
	map.put("USA",256);
	map.put("Thailand",90);
	map.put("Sweden",46);
	map.put("Saudi",966);
	map.put("Russia",7);
	map.put("Srilanka",852);
	
	System.out.println(map.size());
	Integer value=map.get("IND");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("PAK");
	System.out.println(contains);
	
	contains=map.containsValue(256);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	});
	
}
}

