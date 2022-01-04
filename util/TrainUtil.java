package com.xworkz.train.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.ClosedConnectionException;
import com.xworkz.train.constant.Traa;

public class TrainUtil {
	public static Connection createConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(Traa.url, Traa.username, Traa.password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void CloseConnection(Connection sqlCon) {
		if (sqlCon != null) {
			try {
				sqlCon.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

	}
}
