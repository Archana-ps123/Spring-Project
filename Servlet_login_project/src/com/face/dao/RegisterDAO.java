package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.bo.RegisterBo;

public class RegisterDAO {
	public static final RegisterDAO regdao = new RegisterDAO();
	public static void save(Connection c,RegisterBo regbo) {
		try {
	        Statement stmt = c.createStatement();
	        System.out.println("data entered successfully");
	        String string="INSERT INTO register(firstName,lastName,userName,password,emailId,mobno) VALUES ('"+regbo.getFname()+"','"+regbo.getLname()+"','"+regbo.getUname()+"','"+regbo.getPswd()+"','"+regbo.getEmailId()+"','"+regbo.getMob()+"')";
	        int resultset = stmt.executeUpdate(string);
	        if(resultset == 1)
	        	System.out.println("Data inserted Successfully");
	        else
	        	System.out.println("Please check your connection");
	  } catch (SQLException e) {
	        
	    }
	}
}
