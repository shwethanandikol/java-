package com.xworkz.maping;
import java.util.Map;
import java.util.*;

public class Planet {
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
	
	
	map.put("Mars",1);
	map.put("Earth",2);
	map.put("Jupiter",82);
	map.put("Neptune",79);
	map.put("Saturn",14);
	
	System.out.println(map.size());
	Integer value=map.get("Venus");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Jupiter");
	System.out.println(contains);
	
	contains=map.containsValue(1);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	});
	
}
}

