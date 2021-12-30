package com.xworkz.states4;

public class States4Tester {
	public static void main(String[] args) {
		
	States4DTO dto=new States4DTO(54, "india", 91, "asia");
	States4DTO dto1=new States4DTO(91, "australia",611, "canberra");
	States4 ct=new States4();
//ct.save(dto1);
	ct.delete(91);
}
}



