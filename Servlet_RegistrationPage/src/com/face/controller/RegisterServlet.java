package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/**
 * @author Archana
 * Action servlet implementation class to perform user registration 
 * @Date-14-11-2019
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @imp1Spec ->method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String user = request.getParameter("uname");
		String password = request.getParameter("pswd");
		String emailId = request.getParameter("email");
		String mobile = request.getParameter("mob");
		RegisterBO regbo = new RegisterBO();
		/**
		 * ENCAPSULATION PART
		 */
		regbo.setFname(fname);
		regbo.setLname(lname);
		regbo.setUname(user);
		regbo.setPswd(password);
		regbo.setEmailId(emailId);
		regbo.setMobile(mobile);
		
		/////////////////////////////
		
		ConnectionManager con = new ConnectionManager();
		try {
			System.out.println("calling method");
		RegisterDAO.save(con.getConnection(),regbo);
	
		}catch (Exception e) {
			e.printStackTrace();
		}
				
	}

}
