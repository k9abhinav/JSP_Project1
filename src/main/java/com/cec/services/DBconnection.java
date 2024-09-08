package com.cec.services;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

public class DBconnection {

	public static String url = "jdbc:mysql://localhost:3306/cec_portal";
	public static String STUDENT_USERNAME ="root";
	public static String STUDENT_PWD = "Abhinava#03"; 

	public static Connection myConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class loaded");
			connection = DriverManager.getConnection(url,STUDENT_USERNAME,STUDENT_PWD);
			System.out.println("CONNECTION ESTABLISHED");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void main(String[] args) {
		

	}

}
