package com.face.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class ConnectionManager {
	static Connection conn = null;
	public static Properties loadproPertiesFile() throws IOException {
		Properties prop = new Properties();
		InputStream in = new FileInputStream("C:\\Users\\USER\\eclipse-workspace\\Registration\\resources\\jdbc.properties");
		prop.load(in);
		in.close();
		return prop;
	}
	
	//conection to DB
	public Connection getConnection() throws SQLException, ClassNotFoundException, IOException
	{
		Properties prop = loadproPertiesFile();
		final String driver = prop.getProperty("driver");
		final String url = prop.getProperty("url");
		final String username = prop.getProperty("username");
		final String password = prop.getProperty("password");
		
		
		Class.forName(driver);
		
		
	
			conn = DriverManager.getConnection(url,username,password);
			if(conn != null)
			{
				System.out.println("Connected");
			}
			else {
				System.out.println("Not connected");
			}
			return conn;
		} 
	}


