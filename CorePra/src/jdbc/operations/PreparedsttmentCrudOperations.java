package jdbc.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

import jdbc.beans.Product;
import jdbc.constants.JdbcConstants;
import jdbc.utils.DateUtils;
import jdbc.utils.JdbcConnectionTest;

public class PreparedsttmentCrudOperations {

	private static PreparedStatement pst = null;
	private static Connection con = null;

	private static void insert(String query) {

		try {
			con = JdbcConnectionTest.getConnection();
			// ope nthe prepared statent and execute the query

			pst = con.prepareStatement(query);
			pst.setLong(1, 110L);
			pst.setString(2, "Ladyfinger");
			pst.setString(3, "5");
			pst.setString(4, "500");
			pst.setDate(5, DateUtils.strDateToSqlDate("2021-11-30"));
			int i = pst.executeUpdate();
			if (i > 0) {
				System.out.println("Data has been insterd");
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (pst != null && con != null) {
				try {
					pst.close();
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
		pst = null;
	}

	private static void update(String update_query) {
		try {
			con = JdbcConnectionTest.getConnection();
			// ope nthe prepared statent and execute the query

			pst = con.prepareStatement(update_query);
			pst.setString(1, "carrot");
			pst.setLong(2, 105L);
			int i = pst.executeUpdate();
			if (i > 0) {
				System.out.println("update has been insterd");
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (pst != null && con != null) {
				try {
					pst.close();
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
		pst = null;

	}

	private static void delete(String delete_query) {
		try {
			con = JdbcConnectionTest.getConnection();
			// ope nthe prepared statent and execute the query

			pst = con.prepareStatement(delete_query);
			pst.setLong(1, 109L);
			int i = pst.executeUpdate();
			if (i > 0) {
				System.out.println("delete has been done");
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (pst != null && con != null) {
				try {
					pst.close();
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
		pst = null;

	}

	private static void select(String select_query) {

		try {
			con = JdbcConnectionTest.getConnection();
			// ope nthe prepared statent and execute the query

			pst = con.prepareStatement(select_query);

			ResultSet rs = pst.executeQuery();
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
			if (pst != null && con != null) {
				try {
					pst.close();
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
		pst = null;

	}
	private static void selectById(String select_byId_query) {
		
		try {
			con = JdbcConnectionTest.getConnection();
			// ope nthe prepared statent and execute the query

			pst = con.prepareStatement(select_byId_query);
			pst.setLong(1, 104L);

			ResultSet rs = pst.executeQuery();
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
			if (pst != null && con != null) {
				try {
					pst.close();
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
		pst = null;

		
		
		
	}

	private static void batchProcess(String insert_query) {
		
		try {
			con = JdbcConnectionTest.getConnection();
			pst = con.prepareStatement(insert_query);
			con.setAutoCommit(false);
			// Rec - 1
			pst.setLong(1, 111L);
			pst.setString(2, "Ladyfinger");
			pst.setString(3, "5");
			pst.setString(4, "500");
			pst.setDate(5, DateUtils.strDateToSqlDate("2021-11-30"));
			pst.addBatch();
			
			// Rec - 1
			pst.setLong(1, 112L);
			pst.setString(2, "Ladyfinger");
			pst.setString(3, "5");
			pst.setString(4, "500");
			pst.setDate(5, DateUtils.strDateToSqlDate("2021-11-30"));
			pst.addBatch();
			
			// Rec - 1
			pst.setLong(1, 113L);
			pst.setString(2, "Ladyfinger");
			pst.setString(3, "5");
			pst.setString(4, "500");
			pst.setDate(5, DateUtils.strDateToSqlDate("2021-11-30"));
			pst.addBatch();
			// Rec - 1
			pst.setLong(1, 114L);
			pst.setString(2, "Ladyfinger");
			pst.setString(3, "5");
			pst.setString(4, "500");
			pst.setDate(5, DateUtils.strDateToSqlDate("2021-11-30"));
			pst.addBatch();
			
			// Rec - 1
			pst.setLong(1, 116L);
			pst.setString(2, "Ladyfinger");
			pst.setString(3, "5");
			pst.setString(4, "500");
			pst.setDate(5, DateUtils.strDateToSqlDate("2021-11-30"));
			
			pst.addBatch();
			int[] updateCounts = pst.executeBatch();
            System.out.println(Arrays.toString(updateCounts));
            con.commit();
            con.setAutoCommit(true);
			
		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (pst != null && con != null) {
				try {
					pst.close();
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
		pst = null;
		
	}
	public static void main(String[] args) {
		// insert(JdbcConstants.insert_query);
		// update(JdbcConstants.update_query);
		// delete(JdbcConstants.delete_query);
		//select(JdbcConstants.select_query);
		//selectById(JdbcConstants.select_byId_query);
		batchProcess(JdbcConstants.insert_query);
		

	}



}
