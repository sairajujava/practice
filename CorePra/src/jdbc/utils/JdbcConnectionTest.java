package jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionTest {

	// add the properties of database [ mysql , oracle ...etc ]

	private static final String USERNAME = "root";
	private static final String PASSOWRD = "root";
	private static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/fbatch?useSSL=false";

	public static Connection getConnection() {

		try {
			// load the Driver
			Class.forName(DRIVER_NAME);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSOWRD);
			return con;

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static void main(String[] args) {

		Connection con = getConnection();
		System.out.println("Version 3 Connection :"+con);

	}

}
