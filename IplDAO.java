package com.xworkz.crud;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IplDAO {
private static String iplTeam = " ";
private Collection<String> iplTeamCollection = new ArrayList<String>();
public boolean save (String  iplTm) {
	  return iplTeamCollection.add(iplTm);
}
public boolean find (String tm) {
	return iplTeamCollection.contains(tm);
}
public boolean findByCaseInsensitive(String tm) {
	Iterator<String> itr = iplTeamCollection.iterator();
	 while (itr.hasNext()) {
	String tempTm=itr.next();
	if(tempTm.equalsIgnoreCase(tm)) {
		return true;
	}
	 }
	return false;
}
public boolean findByCaseInSensitiveAndTrimmed(String tm) {
	Iterator<String> itr = iplTeamCollection.iterator();
	while(itr.hasNext()) {
		String tempTm = itr.next();
		 tempTm = tempTm.replace(" ", "");
		iplTeam =iplTeam.replace(" ", "");
		if(tempTm.equalsIgnoreCase(iplTeam)) {
			return true;
		}
	}
		return false;
	}
}






