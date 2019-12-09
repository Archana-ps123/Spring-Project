package com.face.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.face.bo.UserAccount;
import com.face.dao.DBUtils;
import com.face.dao.MyUtils;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet(urlPatterns = { "/productList" })
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome to Product Servlet");
	       RequestDispatcher dispatcher //
	               = this.getServletContext().getRequestDispatcher("/WEB-INF/views/productView.jsp");
	       dispatcher.forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("userName");
	       String password = request.getParameter("password");
	       String rememberMeStr = request.getParameter("rememberMe");
	       boolean remember = "Y".equals(rememberMeStr);
	       UserAccount user = null;
	       boolean hasError = false;
	       String errorString = null;
	       if (userName == null || password == null || userName.length() == 0 || password.length() == 0) {
	           hasError = true;
	           errorString = "Required username and password!";
	       } else {
	           Connection conn = MyUtils.getStoredConnection(request);
	           try {
	               // Find the user in the DB.
	              DBUtils.displayProduct(conn);
	             //  if (user == null) {
	               //    hasError = true;
	                 //  errorString = "User Name or password invalid";
	               //}
	           //} catch (SQLException e) {
	             //  e.printStackTrace();
	               //hasError = true;
	               //errorString = e.getMessage();
	           //}
	       //}
	       // If error, forward to /WEB-INF/views/login.jsp
	       //if (hasError) {
	         //  user = new UserAccount();
	           user.setUserName(userName);
	           user.setPassword(password);
	           // Store information in request attribute, before forward.
	           request.setAttribute("errorString", errorString);
	           request.setAttribute("user", user);
	           // Forward to /WEB-INF/views/login.jsp
	           RequestDispatcher dispatcher //
	                   = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
	           dispatcher.forward(request, response);
	       }
	       // If no error
	       // Store user information in Session
	       // And redirect to userInfo page.
	       else {
	           HttpSession session = request.getSession();
	           MyUtils.storeLoginedUser(session, user);
	           // If user checked "Remember me".
	           if (remember) {
	               MyUtils.storeUserCookie(response, user);
	           }
	           // Else delete cookie.
	           else {
	               //MyUtils.deleteUserCookie(response);
	        	   System.out.println("else");
	               
	           }
	           // Redirect to userInfo page.
	           response.sendRedirect(request.getContextPath() + "/userInfo");
	       }
		
	}

}


