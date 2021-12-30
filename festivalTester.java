package com.xworkz.festival;

public class festivalTester {
	public static void main(String[] args) {
		
	festivalDTO dto=new festivalDTO(9, "diwali", "november", "laxmi");
	festival fe=new festival();
	fe.save(dto);
			
}
}
