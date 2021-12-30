package com.xworkz.waterfall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class waterfall{
	

public static void main(String[] args) {
	String trip="com.mysql.cj.jdbc.Driver";
	Connection conn=null;
	try {
		Class.forName(trip);
		System.out.println("imported the Driver class");
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="1996";
		 conn=DriverManager.getConnection(url,username,password);
		String str="insert into waterfall.water value(2,'dudsagar','kasalrock','850')";
		
//		String str1="insert into waterfall value(1,'jogfalls','sagar','1050')";
		java.sql.Statement masties=conn.createStatement();
		int ref=masties.executeUpdate(str);
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
}

	

}
