package com.connections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public static Connection getConnection()
	{
		Connection conObj = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/deviaredb2","root", "root");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return conObj;
	}
}