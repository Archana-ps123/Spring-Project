package com.face.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.LoginBO;


public class LoginDAO {

	public static final LoginDAO ldao = new LoginDAO();
	public static boolean check(Connection c,LoginBO lbo) {
		System.out.println("sibin");
		 boolean status = true;
		try {
	        Statement stmt = c.createStatement();
	        System.out.println("Checking method");
	        String username = lbo.getUsername();
	        System.out.println(username);
	        String pswd = lbo.getPassword();
	       
	        String sql = "Select userName ,password from register";
	        System.out.println("userName");
	        /////////////////////////////////////////////////////////
	        
	        PreparedStatement pstmt = c.prepareStatement(sql);
          
            ResultSet rs = pstmt.executeQuery(sql);
	        	
	       
	       	        while(rs.next()) {
	       	        	
			            if(rs.getString(1).equals(username) && (rs.getString(2).equals(pswd))) {
			            	lbo.setUsername(rs.getString(1));
			            	System.out.println("Success");
			            	status = true;
			            	break;
	            }
	         else {
	        	status = false;
	        }
			            
	        
	    
	       	        }} catch (SQLException e) {
	        
	    }
		return status;
	}}



