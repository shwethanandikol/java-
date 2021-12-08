package com.xworkz.Pg.crud;

public class PGDAOStater {
	public static void main(String[] args) {
		PGDAO pgDAO = new PGDAO();
		pgDAO.save("Gajanana PG");
		pgDAO.save("Kushi PG");
		pgDAO.save("Sai PG");
		pgDAO.save("Priencess PG");
		pgDAO.save("Golden PG");
		
		System.out.println("Comparing values");
		boolean found = pgDAO.find("Kushi PG");
		boolean found1 = pgDAO.find("Priencess pg");
		System.out.println(found + "\n" + found1);
		
		System.out.println("Comparing values and neglating cases");
		found = pgDAO.findPgByIgnoringCases("sai PG");
		found1 = pgDAO.findPgByIgnoringCases("PriencessPG");
		System.out.println(found + "\n" + found1);
		
		System.out.println("Comparing values, neglating cases and spaces");
		found = pgDAO.findPgByIgnoringCasesAndSpaces("Golden pG");
		found1 = pgDAO.findPgByIgnoringCasesAndSpaces("Golden PG");
		System.out.println(found + "\n" + found1);
		}
}

