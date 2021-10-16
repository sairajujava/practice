package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Student;
import com.service.UserService;
import com.service.serviceImpl.UserServiceImpl;
import com.utils.DateUtils;

@WebServlet(asyncSupported = false, name = "Login", urlPatterns = { "/login", "/add", "/save", "/list", "/edit", "/update" , "/delete" })
public class Login extends HttpServlet {

	private UserService userService;

	public void init() {

		userService = new UserServiceImpl();

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		this.doGet(req, res);

	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// get the request URI path from url

		String action = req.getServletPath();

		System.out.println("Servlet Path :" + action);

		switch (action) {
		case "/login":

			this.loginUser(req, res);
			break;
		case "/add":
			this.createUser(req, res);
			break;
		case "/save":
			this.saveUser(req, res);
			break;
		case "/list":
			this.listUser(req, res);
			break;
		case "/edit":
			this.editUser(req, res);
			break;
		case "/update":
			this.updateUser(req, res);
			break;
		case "/delete":
			this.deleteUser(req, res);
			break;
		default:
			break;

		}

	}

	private void deleteUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = req.getParameter("id");
		// convert String to Long
		long userId = Long.parseLong(id);
		System.out.println("Delete ID:"+userId);
		
		int i = userService.deleteUser(userId);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/list.jsp");
        dispatcher.forward(req, res);
		
	}

	private void updateUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		// convert String to Long
		long userId = Long.parseLong(id);
		String uname = req.getParameter("username");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String course = req.getParameter("course");
		String mobile = req.getParameter("mobile");

		// add he req meta data to student bean and send to service layer

		Student stu = new Student(userId,uname, email, DateUtils.convertStrDateToSqlDate(dob), course, mobile);
		System.out.println("Student Updated Info :" + stu.toString());
		

		boolean status = userService.update(stu);

		if (status) {
			RequestDispatcher rd = req.getRequestDispatcher("views/list.jsp");
			rd.forward(req, res);
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("views/register.jsp");
			PrintWriter out = res.getWriter();
			out.print("<font color=red>Either user name or password is wrong.</font>");
			rd.include(req, res);
		}

		
	}

	private void editUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		// convert String to Long
		long userId = Long.parseLong(id);
		
		Student dbStu = userService.getUserById(userId);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/create.jsp");
        req.setAttribute("dbStu", dbStu);
        dispatcher.forward(req, res);
		
	}

	private void listUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		// Fetch the List of users from tbl_student table

		List<Student> listUsers = userService.viewUsers();
		req.setAttribute("listUsers", listUsers);
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/list.jsp");
		dispatcher.forward(req, res);

	}

	private void saveUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String uname = req.getParameter("username");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String course = req.getParameter("course");
		String mobile = req.getParameter("mobile");

		// add he req meta data to student bean and send to service layer

		Student stu = new Student(uname, email, DateUtils.convertStrDateToSqlDate(dob), course, mobile);
		System.out.println("userBean :" + stu.toString());

		boolean status = userService.save(stu);

		if (!status) {
			RequestDispatcher rd = req.getRequestDispatcher("views/list.jsp");
			PrintWriter out = res.getWriter();
			out.print("<font color=red>User Successfully created...!</font>");
			rd.forward(req, res);
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("views/register.jsp");
			PrintWriter out = res.getWriter();
			out.print("<font color=red>Either user name or password is wrong.</font>");
			rd.include(req, res);
		}

	}

	private void createUser(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		RequestDispatcher rd = req.getRequestDispatcher("views/create.jsp");
		rd.forward(req, res);

	}

	private void loginUser(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		String email = req.getParameter("email");
		String pwd = req.getParameter("password");
		System.out.println(email + " : " + pwd);

		boolean status = userService.login(email, pwd);
		if (status) {
			HttpSession session = req.getSession();
			session.setAttribute("email", email);
			session.setMaxInactiveInterval(1 * 60);
			Cookie cookie = new Cookie("email", email);
			cookie.setMaxAge(1 * 60);
			res.addCookie(cookie);
			res.sendRedirect("views/view.jsp");
			/*
			 * RequestDispatcher rd = req.getRequestDispatcher(""); rd.forward(req, res);
			 */
		} else {
			// res.sendRedirect("views/login.jsp");
			RequestDispatcher rd = req.getRequestDispatcher("views/login.jsp");
			PrintWriter out = res.getWriter();
			out.print("<font color=red> Either username or password is wrong.</font>");
			rd.forward(req, res);
		}

	}

}
