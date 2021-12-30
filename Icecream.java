package com.xworkz.icecream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class Icecream {
	
public boolean save(IcecreamDTO fst) {
	Connection conn=null;
	
	String fest="com.mysql.cj.jdbc.Driver";
	
	try {
		Class.forName(fest);
		System.out.println("the Driver class");
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="1996";
		 conn=DriverManager.getConnection(url,username,password);
		String str="insert into ice.cool value("+fst.getId()+",'"+fst.getName()+"','"+fst.getFlavour()+"','"+fst.getPrice()+"')";
	
 
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
		String str="delete from ice.cool where id= "+id;
	
 
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


