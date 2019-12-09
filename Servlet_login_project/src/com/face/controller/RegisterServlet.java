package com.face.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBo;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;

/*****
 * Servlet implementation class RegisterServlet
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RegisterServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String fname = request.getParameter("firstname");

		String lname = request.getParameter("lastname");

		String uname = request.getParameter("username");

		String pswd = request.getParameter("password");

		String emailId = request.getParameter("email");

		String mob = request.getParameter("mobile");
		RegisterBo regbo = new RegisterBo();
		regbo.setFname(fname);
		regbo.setLname(lname);
		regbo.setUname(uname);
		regbo.setPswd(pswd);
		regbo.setEmailId(emailId);
		regbo.setMob(mob);
		ConnectionManager conn = new ConnectionManager();
		RegisterDAO regdao = new RegisterDAO();

	}

}
