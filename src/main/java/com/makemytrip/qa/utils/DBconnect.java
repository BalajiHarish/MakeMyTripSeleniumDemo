package com.makemytrip.qa.utils;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBconnect {
	
	public static Connection con = null;

	public void dbConnect(String dbHost, String dbUserName, String dbPwd) {

		try {
			
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(dbHost, dbUserName, dbPwd);
			System.out.println("Database Connected Successfully");
		} catch(Exception e) {
			
			System.out.println("Error in database connectivity : " + e.toString());
		}
	}

}
