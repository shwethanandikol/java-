package com.xworkz.icecream;


public class IcecreamTester {
	public static void main(String[] args) {
		
	IcecreamDTO dto=new IcecreamDTO(10, "creambell", "blueberry", 45);
	IcecreamDTO dto1=new IcecreamDTO(21, "ammul", "black current",55);
	Icecream ct=new Icecream();
//ct.save(dto1);
	ct.delete(10);
}
}