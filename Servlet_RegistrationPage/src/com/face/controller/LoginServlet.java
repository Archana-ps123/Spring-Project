package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.LoginBO;
import com.face.dao.LoginDAO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * Servlet implementation class LoginServlet
 */

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			LoginBO lbo = new LoginBO();
			
			lbo.setUsername(username);
			lbo.setPassword(password);
			
			
			ConnectionManager con = new ConnectionManager();
			try {
				System.out.println("calling method");
			boolean checkStatus= LoginDAO.check(con.getConnection(),lbo);
			String nam=lbo.getUsername();
			if(checkStatus == true)
			{
           request.setAttribute("name1",lbo.getUsername());
				

          request.getRequestDispatcher("Welcome.jsp").forward(request, response);
				//response.sendRedirect("Welcome.jsp");
			}
			else
			{
				System.out.println("Invalid Username and password");
			}
			
		
			}catch (Exception e) {
				e.printStackTrace();
			}
				
			
	}

}
