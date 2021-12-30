package com.xworkz.cities.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import com.xworkz.cities.CitiesDTO;

public class Cities {
	
public boolean save(CitiesDTO fst) {
	Connection conn=null;
	
	String fest="com.mysql.cj.jdbc.Driver";
	
	try {
		Class.forName(fest);
		System.out.println("the Driver class");
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="1996";
		 conn=DriverManager.getConnection(url,username,password);
		String str="insert into city.peace value("+fst.getId()+",'"+fst.getName()+"','"+fst.getpopulation()+"','"+fst.getfamous()+"')";
	
 
		Statement Cities=conn.createStatement();
		int ref=Cities.executeUpdate(str);
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
public void delete(int id) {
	Connection conn=null;
	
	String fest="com.mysql.cj.jdbc.Driver";
	
	try {
		Class.forName(fest);
		System.out.println("the Driver class");
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="1996";
		 conn=DriverManager.getConnection(url,username,password);
		String str="delete from city.peace where id= "+id;
 
		Statement Cities=conn.createStatement();
		int ref=Cities.executeUpdate(str);
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
	return;
}

}




