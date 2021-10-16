package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;
import com.service.UserService;
import com.service.serviceImpl.UserServiceImpl;
import com.utils.DateUtils;
@WebServlet(asyncSupported = false, name = "RegisterSevlet", urlPatterns = {"/register"})
public class UserController extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	
	public void init() {
		
		userService = new UserServiceImpl();
		
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String uname = req.getParameter("username");
		String pwd = req.getParameter("password");
		String email = req.getParameter("email");
		String dob = req.getParameter("dob");
		String mobile = req.getParameter("mobile");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		
		// add he req meta data to userbean and send to service layer
		
		UserBean ub = new UserBean(uname, pwd, email, DateUtils.convertStrDateToSqlDate(dob), mobile, city, state, country);
		System.out.println("userBean :"+ub.toString());
		
		boolean status = userService.register(ub);
		
		if (!status) {
			RequestDispatcher rd = req.getRequestDispatcher("views/login.jsp");
			rd.forward(req, res);
		} else {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("views/register.jsp");
			PrintWriter out = res.getWriter();
			out.println("<font color=red>Either user name or password is wrong.</font>");
			rd.include(req, res);
		}

		
		
		
	}
}
