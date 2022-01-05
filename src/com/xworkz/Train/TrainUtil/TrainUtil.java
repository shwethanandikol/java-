package com.xworkz.Train.TrainUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.Train.Constant.*;

public class TrainUtil {

	public static Connection createconnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(Constant.URL, Constant.USERNAME, Constant.PASSWORD);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return con;

	}

	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}

	}
}
