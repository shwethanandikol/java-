package com.xworkz.maping;

import java.util.Map;
import java.util.*;

public class LaptopModel{
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
	
	
	map.put("Dell",13);
	map.put("Lenova",12);
	map.put("HP",15);
	map.put("Toshiba",14);
	map.put("MacBook",13);
	map.put("Dell",17);
	
	System.out.println(map.size());
	Integer value=map.get("HP");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Samsung");
	System.out.println(contains);
	
	contains=map.containsValue(12);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	});
	
}
}
