package com.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.UserService;
import com.service.serviceImpl.UserServiceImpl;
import com.utils.EmailUtility;
 
 
/**
 * A Java Servlet to handle requests to reset password for customer
 *
 * @author www.codejava.net
 *
 */
@WebServlet(asyncSupported = false, name = "ResetPasswordServlet", urlPatterns = { "/reset_password" })
public class ResetPasswordServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    private String host;
    private String port;
    private String email;
    private String name;
    private String pass;
    
    private UserService userService;
    public void init() {
        // reads SMTP server setting from web.xml file
        ServletContext context = getServletContext();
        host = context.getInitParameter("host");
        port = context.getInitParameter("port");
        email = context.getInitParameter("email");
        name = context.getInitParameter("name");
        pass = context.getInitParameter("pass");
        userService = new UserServiceImpl();
    }
 
    public ResetPasswordServlet() {
    }
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String page = "views/forgor-password.jsp";
        request.getRequestDispatcher(page).forward(request, response);
 
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String recipient = request.getParameter("email");
        String subject = "Your Password has been reset";
 
        //CustomerServices customerServices = new CustomerServices(request, response);
        String newPassword = userService.resetCustomerPassword(recipient);
 
        String content = "Hi, this is your existing password: " + newPassword;
        content += "\nNote: for security reason, "
                + "you must change your password after logging in.";
 
        String message = "";
 
        try {
            EmailUtility.sendEmail(host, port, email, name, pass,
                    recipient, subject, content);
            message = "Your password has been reset. Please check your e-mail.";
        } catch (Exception ex) {
            ex.printStackTrace();
            message = "There were an error: " + ex.getMessage();
        } finally {
            request.setAttribute("message", message);
            request.getRequestDispatcher("views/message.jsp").forward(request, response);
        }
    }
 
}