package jdbc.operations;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.beans.Product;
import jdbc.utils.JdbcConnectionTest;

public class CallableStatmentTest {

	private static Connection con = null;
	private static CallableStatement cst = null;

	public static void main(String[] args) {
		
		
		String procedure_query = "call get_products";
		
		try {
			 con = JdbcConnectionTest.getConnection();
			 cst  = con .prepareCall(procedure_query);
			ResultSet rs = cst.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setId(rs.getLong("p_id"));
				p.setName(rs.getString("p_name"));
				p.setQty(rs.getString("p_qty"));
				p.setPrice(rs.getString("p_price"));
				p.setExDate(rs.getDate("p_exdate"));
				System.out.println(p);
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (cst != null && con != null) {
				try {
					cst.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		con = null;
		cst = null;
}
}
