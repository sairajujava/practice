package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	ServletConfig config = null;

	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("iniside init method : " + config.getServletName());
	}

	public ServletConfig getServletConfig() {
		return config;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("inside service method");
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b> Servlet Interface Example</b>");
		out.print("</body></html>");

	}

	public String getServletInfo() {
		return "Demonstrated implementaton of Servlet interface";
	}

	public void destroy() {
		System.out.println("inside destroy method");
	}

}
