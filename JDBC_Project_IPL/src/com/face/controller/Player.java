package com.face.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import com.face.util.ConnectionManager;

public class Player {

	ConnectionManager con = new ConnectionManager();
	Scanner sc = new Scanner(System.in);
	List listobj = new List();
	AddPlayer apobj = new AddPlayer();
	 SearchPlayer sobj = new  SearchPlayer();
	public void player() throws ClassNotFoundException, SQLException, IOException {
		con.getConnection();
		System.out.println("!!!!!!!!!!!!!! Welcome To Player Details !!!!!!!!!!");
		do {
		System.out.println("Menu\n1. List all Players \n2. Add new Player\n3. Search Player\n4. Exit");
		 System.out.println("Enter your option");
		int ch;
	    ch = sc.nextInt();
	    
	    	switch(ch)
	    	{
	    	case 1:
	    	listobj.display(con.getConnection());
	    	break;
	    	case 2:
	    		apobj.AddPlayer(con.getConnection());
	    		break;
	    	case 3:
	    		sobj.SearchPlayer(con.getConnection());
	    		break;
	    	case 4:
	    		System.exit(0);
	    		}
	    }while(true);
		
	}
	

}
