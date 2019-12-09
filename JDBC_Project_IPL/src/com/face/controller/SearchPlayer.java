package com.face.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.face.bo.PlayerBO;


public class SearchPlayer {

	public void SearchPlayer(Connection con) throws SQLException {
		PlayerBO pbo = new PlayerBO ();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the skill name");
		String skill = sc.nextLine();
		pbo.setSkill(skill);
		System.out.println(skill);

	       
        String sql = "Select * from playerdetails where skill = '"+skill+"'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        ResultSet rs = pstmt.executeQuery(sql);
        	
       
       	        while(rs.next()) {
       	        	
		          //  if(rs.getString(1).equals(pbo.getSkill())) {
		            
		            	System.out.println(rs.getString(1));
                     	System.out.println(rs.getString(2));
		            	System.out.println(rs.getString(3));
		            	System.out.println(rs.getString(4));
		            	System.out.println(rs.getString(5));


            
		
		
	}

	}}
