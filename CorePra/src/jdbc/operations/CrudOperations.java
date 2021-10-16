package jdbc.operations;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import jdbc.beans.Product;
import jdbc.utils.DateUtils;
import jdbc.utils.JdbcConnectionTest;

public class CrudOperations {

	private static Connection con = null;
	private static Statement st = null;

	private static void create(String create_sql) {

		try {
			// Load the driver and get the connection
			con = JdbcConnectionTest.getConnection();
			st = con.createStatement();
			boolean status = st.execute(create_sql);
			if (!status) {
				System.out.println("Table hasbenn created");
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (st != null && con != null) {
				try {
					st.close();
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
		st = null;

	}

	private static void insert(Product product) {

		Long id = product.getId();

		String insert_Query = "insert into fbatch.product values('" + product.getId() + "','" + product.getName()
				+ "','" + product.getQty() + "' , '" + product.getPrice() + "', '" + product.getExDate() + "') ";

		try {
			// Load the driver and get the connection
			con = JdbcConnectionTest.getConnection();
			st = con.createStatement();
			boolean status = st.execute(insert_Query);
			if (!status) {
				System.out.println("data hasbeen inserted successfully");
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (st != null && con != null) {
				try {
					st.close();
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
		st = null;

	}

	private static void select(String select_query) {

		try {
			// Load the driver and get the connection
			con = JdbcConnectionTest.getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery(select_query);
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
			if (st != null && con != null) {
				try {
					st.close();
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
		st = null;

	}

	private static void update(Product product) {

		try {
			// Load the driver and get the connection
			con = JdbcConnectionTest.getConnection();
			st = con.createStatement();
			String update_query = "update fbatch.product set p_name='" + product.getName() + "', p_qty='"
					+ product.getQty() + "',p_price='" + product.getPrice() + "' where p_id='" + product.getId() + "' ";
			int i = st.executeUpdate(update_query);

			if (i > 0) {
				System.out.println("Record has been updated");
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (st != null && con != null) {
				try {
					st.close();
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
		st = null;

	}

	private static void delete(long id) {

		try {
			// Load the driver and get the connection
			con = JdbcConnectionTest.getConnection();
			st = con.createStatement();
			String delete_query = "delete from fbatch.product where p_id='" + id + "' ";
			int i = st.executeUpdate(delete_query);

			if (i > 0) {
				System.out.println("Record has been deleted");
			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (st != null && con != null) {
				try {
					st.close();
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
		st = null;

	}

	private static void group() {
		try {
			// Load the driver and get the connection
			con = JdbcConnectionTest.getConnection();
			st = con.createStatement();
			String group_query = "SELECT p_name, COUNT(*) FROM product GROUP BY p_name";
			ResultSet rs = st.executeQuery(group_query);

			while (rs.next()) {
				Product p = new Product();
				p.setName(rs.getString("p_name"));
				System.out.println(p.getName() + " : " + rs.getLong("COUNT(*)"));

			}

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (st != null && con != null) {
				try {
					st.close();
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
		st = null;

	}

	private static void batchProcess() {

		String sq1 = "insert into fbatch.product values(105,'brinjal','10' , '1000', '2021-11-15') ";
		String sq2 = "insert into fbatch.product values(106,'brinjal','10' , '1000', '2021-11-15') ";
		String sq3 = "insert into fbatch.product values(107,'brinjal','10' , '1000', '2021-11-15') ";
		String sq4 = "insert into fbatch.product values(108,'brinjal','10' , '1000', '2021-11-15') ";
		String sq5 = "insert into fbatch.product values(109,'brinjal','10' , '1000', '2021-11-15') ";

		try {
			// Get the connection
			con = JdbcConnectionTest.getConnection();
			con.setAutoCommit(false);
			st = con.createStatement();
			st.addBatch(sq1);
			st.addBatch(sq2);
			st.addBatch(sq3);
			st.addBatch(sq4);
			st.addBatch(sq5);
			int[] intArr = st.executeBatch();
			System.out.println(Arrays.toString(intArr));
			con.commit();

		} catch (Exception e) {
			System.out.println("create:" + e.getMessage());
		} finally {
			if (st != null && con != null) {
				try {
					st.close();
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
		st = null;
	}

	public static void main(String[] args) {
		Product product = new Product(105L, "brinajal", "50", "500", DateUtils.strDateToSqlDate("2021-11-15"));

		// create(JdbcConstants.create_sql);
		// insert(product);
		// select(JdbcConstants.select_query);
		// update(product);
		// delete(105L);
		// group();
		batchProcess();
	}

}
