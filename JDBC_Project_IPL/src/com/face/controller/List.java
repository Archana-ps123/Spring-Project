package com.face.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.face.util.ConnectionManager;
import java.sql.Connection;

public class List {
	
	public void display(Connection con) throws SQLException {

		 
Statement statement = con.createStatement();
 
ResultSet rst = statement.executeQuery("SELECT * FROM playerdetails;");


while (rst.next()) {
    String playerName = rst.getObject(1).toString();
    
    String country = rst.getObject(2).toString();

    String skill = rst.getObject(3).toString();

    String  team= rst.getObject(4).toString();

    System.out.println(playerName+"\t\t"+country+"\t\t\t\t"+skill+"\t\t\t\t"+team);




}


	}


		
		
	}


