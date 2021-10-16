package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {

	// load the mysql database properties

	private final static String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/sbatch?useSSL=false";
	private final static String USERNAME = "root";
	private final static String PASSWORD = "root";

	public static Connection getConnection() {
		
		try {
			// load the driver 
			
			Class.forName(DRIVER_NAME);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			return con;
		}catch (Exception e) {
			System.out.println("connection :"+e.getMessage());
		}

		return null;

	}

	public static void main(String[] args) {
		
		System.out.println(JdbcUtils.getConnection());

	}

}
