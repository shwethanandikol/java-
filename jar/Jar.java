package com.xworkz.jar;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Jar {
public static void main(String[] args) {
	String trip="com.mysql.cj.jdbc.Driver";
	try {
		Class.forName(trip);
		System.out.println("imported the Driver class");
		String url="jdbc:mysql://localhost:3306";
		String username="root";
		String password="1996";
		Connection conn=DriverManager.getConnection(url,username,password);
		String str="insert into jdbc.masties value(20,'lays',2022,'hjjj')";
		String str1="insert into jdbc.masties value(10,'chips',2023,'nav')";
		java.sql.Statement masties=conn.createStatement();
		int ref=masties.executeUpdate(str1);
		System.out.println(ref);
		}
	catch(ClassNotFoundException e) {
		e.printStackTrace();
		
	}
	catch(SQLException sh) {
		sh.printStackTrace();
	}
}
}
