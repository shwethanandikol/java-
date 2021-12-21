package com.xworkz.maping;

import java.util.Map;
import java.util.*;

public class Keyboard {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
	
	
	map.put("Space",1);
	map.put("Enter",2);
	map.put("Numericals",20);
	map.put("Shift",2);
	map.put("esc",1);
	map.put("delet", 1);
	map.put("F keys", 12);
	
	System.out.println(map.size());
	Integer value=map.get("F keys");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Volume");
	System.out.println(contains);
	
	contains=map.containsValue(12);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	});
	
}
}
