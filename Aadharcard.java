package com.xworkz.maping;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Aadharcard {
	public static void main(String[] args) {
		Map<String,Long> map=new HashMap<String,Long>();
	
	map.put("Sushmitha",3435123467L);
	map.put("Brundha",322987601L);
	map.put("Shwetha",61365931502L);
	map.put("Soumya",5487960247L);
	map.put("Sushila",8619100484L);
	map.put("Shruti",214044862535L);
	map.put("Komal",56726540936L);
	map.put("Supritha",43976805319L);
	
	System.out.println(map.size());
	Long value=map.get("Sushmitha");
	System.out.println(value);
	
	
	boolean contains=map.containsKey("Soumya");
	System.out.println(contains);
	
	contains=map.containsValue(1365931502L);
	System.out.println(contains);
	
	Set<String> keys=map.keySet();
	
	keys.forEach((e)->{
	 System.out.println(e);	
	 
	});
	
}
}

