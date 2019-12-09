package com.face.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.face.bo.PlayerBO;

public class AddPlayer {
String name;
String country;
String skill;
String team;
PlayerBO pbo = new PlayerBO();

	public void AddPlayer(Connection con) throws SQLException {
	
		AddPlayer apobj = new AddPlayer();
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Player name");
	    name = sc.nextLine();
	    pbo.setName(name);
	   
	    System.out.println("Enter the Country name ");
	    country = sc.nextLine();
	    pbo.setCountry(country);

	    System.out.println("Enter the Skill ");
	    skill = sc.nextLine();
	    pbo.setSkill(skill);


	    System.out.println("Enter the team name");
	    team = sc.nextLine();
	    pbo.setTeam(team);
	    apobj.insert(con,pbo);
	}
	public void insert(Connection con,PlayerBO pbo) throws SQLException {
		

	      Statement stmt = con.createStatement();
        String sql = "INSERT INTO playerdetails (playerName,country,skill,team) VALUES ('"+pbo.getName()+"','"+pbo.getCountry()+"','"+pbo.getSkill()+"','"+pbo.getTeam()+"')";

          stmt.executeUpdate(sql); 
       System.out.println("Data Entered Successfully");
	    
	}

}

