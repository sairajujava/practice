package jdbc.utils;

import java.sql.Connection;
import java.sql.Statement;

import jdbc.utils.JdbcConnectionTest;

public class CreateTable {

	private static void create(String create_sql) {
		
		// get teh connection
		
		try {
			
			Connection con = JdbcConnectionTest.getConnection();
			
			Statement st = con.createStatement();
			boolean status = st.execute(create_sql);
			if(!status) {
				System.out.println("Table hasbeen created");
			}else {
				System.out.println("exit");
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
			
		
	}
	public static void main(String[] args) {
		
		String create_sql="CREATE TABLE fbatch.employee (e_id INT NOT NULL,e_name VARCHAR(45) NULL,e_mobile VARCHAR(45) NULL,e_sal VARCHAR(32) NULL,PRIMARY KEY (e_id))";
		
		create(create_sql);

	}


}
