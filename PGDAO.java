package com.xworkz.Pg.crud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PGDAO {

	private Collection<String> pgName = new ArrayList<>();

	public boolean save(String pgNam) {
		return pgName.add(pgNam);
	}
	
	public boolean find(String pgNa) {
		return pgName.contains(pgNa);
	}
	
	public boolean findPgByIgnoringCases(String pg) {
		Iterator<String> itr = pgName.iterator();
		while(itr.hasNext()) {
			String tempName = itr.next();
			if(tempName.equalsIgnoreCase(pg)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean findPgByIgnoringCasesAndSpaces(String pgN) {
		Iterator<String> itr = pgName.iterator();
		while(itr.hasNext()) {
			String tempName = itr.next();
			tempName = tempName.replace(" ", "");
			
			if(tempName.equalsIgnoreCase(pgN.replace(" ", ""))) {
				return true;
			}
		}
		return false;
	}
}
