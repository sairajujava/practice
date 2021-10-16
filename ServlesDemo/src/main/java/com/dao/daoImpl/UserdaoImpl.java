package com.dao.daoImpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.beans.Student;
import com.beans.UserBean;
import com.dao.UserDao;
import com.utils.JdbcUtils;

public class UserdaoImpl implements UserDao {

	private Connection con = null;
	private Statement st = null;
	private PreparedStatement pst = null;

	public boolean save(UserBean u) {

		String insert_query = "insert into tbl_user(username,password,email,dob,mobile,city,state,country) values('"
				+ u.getUsername() + "','" + u.getPassword() + "','" + u.getEmail() + "','" + u.getDob() + "','"
				+ u.getMobile() + "','" + u.getCity() + "','" + u.getState() + "','" + u.getCountry() + "')";

		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			st = con.createStatement();
			boolean status = st.execute(insert_query);

			return status;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		con = null;
		st = null;

		return false;
	}

	public boolean isUserExist(String email, String pwd) {

		String select_query = "select email,password from tbl_user where email=? and password=?";
		boolean loginStatus = false;
		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			pst = con.prepareStatement(select_query);
			pst.setString(1, email);
			pst.setString(2, pwd);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				if (email.equalsIgnoreCase(rs.getString("email")) && pwd.equalsIgnoreCase(rs.getString("password"))) {
					loginStatus = true;
				}
			}

			System.out.println("User Dao User status:" + loginStatus);

			return loginStatus;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		con = null;
		st = null;
		return false;
	}

	@Override
	public boolean create(Student stu) {
		String insert_query = "insert into tbl_student(s_name,s_email,s_dob,s_course,s_mobile) values('"
				+ stu.getUsername() + "','" + stu.getEmail() + "','" + stu.getDob() + "','" + stu.getCourse() + "','"
				+ stu.getMobile() + "')";

		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			st = con.createStatement();
			boolean status = st.execute(insert_query);

			return status;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		con = null;
		st = null;

		return false;
	}

	@Override
	public List<Student> list() {

		String select_query = "select * from tbl_student";
		List<Student> users = new ArrayList<Student>();
		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			pst = con.prepareStatement(select_query);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				Long id = rs.getLong("s_id");
				String name = rs.getString("s_name");
				String email = rs.getString("s_email");
				Date date = rs.getDate("s_dob");
				String course = rs.getString("s_course");
				String mobile = rs.getString("s_mobile");
				users.add(new Student(id, name, email, date, course, mobile));

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		con = null;
		st = null;
		System.out.println("UserList:" + users.size());
		return users;
	}

	@Override
	public Student fetchStudentById(Long id) {
		String select_query = "select * from tbl_student where s_id = ?";
		Student stu = new Student();
		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			pst = con.prepareStatement(select_query);
			pst.setLong(1, new Long(id));
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				stu.setId(rs.getLong("s_id"));
				stu.setUsername(rs.getString("s_name"));
				stu.setEmail(rs.getString("s_email"));
				stu.setDob(rs.getDate("s_dob"));
				stu.setCourse(rs.getString("s_course"));
				stu.setMobile(rs.getString("s_mobile"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		con = null;
		st = null;
		return stu;
	}

	@Override
	public boolean update(Student stu) {
		String update_query = "update tbl_student set s_email='"+stu.getEmail()+"', s_dob='"+stu.getDob()+"', s_course='"+stu.getCourse()+"', s_mobile='"+stu.getMobile()+"' where s_name='"+stu.getUsername()+"' ";

		boolean status = false;
		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			st = con.createStatement();
			int i = st.executeUpdate(update_query);
			if(i > 0) {
				status = true;
			}

			return status;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		con = null;
		st = null;

		return status;
	}

	@Override
	public int delete(long userId) {
		String delete_query = "delete from tbl_student where s_id=?";
		int res = 0;
		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			pst = con.prepareStatement(delete_query);
			pst.setLong(1, new Long(userId));
			res = pst.executeUpdate();

			if(res > 0) {
				System.out.println("Data hasbeen deleted...!");
				
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		con = null;
		st = null;
		return res;
	}

	@Override
	public UserBean findByEmail(String recipient) {
		String select_query = "select * from tbl_user where email = ?";
		UserBean stu = new UserBean();
		try {
			// load driver and get connection

			con = JdbcUtils.getConnection();
			pst = con.prepareStatement(select_query);
			pst.setString(1, recipient);
			ResultSet rs = pst.executeQuery();

			while (rs.next()) {
				stu.setUsername(rs.getString("username"));
				stu.setPassword(rs.getString("password"));
				stu.setEmail(rs.getString("email"));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (st != null && con != null) {
					st.close();
					con.close();
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

		con = null;
		st = null;
		return stu;
	}
}
