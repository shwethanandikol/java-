package com.xworkz.festival;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class festival {
public boolean save(festivalDTO fst) {
	String fest="com.mysql.cj.jdbc.Driver";
	Connection conn=null;
	try {
		Class.forName(fest);
		System.out.println("the Driver class");
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="1996";
		 conn=DriverManager.getConnection(url,username,password);
		String str="insert into festival.celebration value("+fst.getId()+",'"+fst.getName()+"','"+fst.getMonth()+"','"+fst.getGod()+"')";
	
//		String str1="insert into festival.celebration value(3,'deepavali','nov','laxmi')";
		java.sql.Statement festival=conn.createStatement();
		int ref=festival.executeUpdate(str);
		System.out.println(ref);
		}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	catch(SQLException sh) {
		sh.printStackTrace();
	}
	finally {
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
	
				e.printStackTrace();
			}
		}
	}
	return false;
}
}
