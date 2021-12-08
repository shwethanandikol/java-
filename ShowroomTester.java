package com.xworkz.clonaeble;

public class ShowroomTester {
public static void main(String[] args) throws CloneNotSupportedException {
	Showroom showroom =new Showroom();
	showroom.setGst("	37AADCS0472N2Z0");
	showroom.setId("gsgsdfh");
	showroom.setName("WestSide");
	showroom.setSales(true);
	Object object = (showroom).clone();
	Showroom showroom2= (Showroom)object;
	System.out.println(object);
}
}
