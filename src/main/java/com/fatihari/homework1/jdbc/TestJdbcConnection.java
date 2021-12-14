package com.fatihari.homework1.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


/* This class is only created to check if the JDBC connection is working. */

public class TestJdbcConnection {

	public static void main(String[] args) 
	{
		
		String jdbcUrl = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "123";
		
		try {
		
			System.out.println("Connection to database: " + jdbcUrl);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successful ! ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
