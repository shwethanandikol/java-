package com.xworkz.cities;

import com.xworkz.cities.dao.Cities;

public class CitiesTester {
	public static void main(String[] args) {
		
	CitiesDTO dto=new CitiesDTO(12, "hyderbad", 20645345, "charminar");
	CitiesDTO dto1=new CitiesDTO(15, "sagara", 645345, "jogfalls");
	Cities ct=new Cities();
	//ct.save(dto);
	ct.delete(12);
			
}


}
