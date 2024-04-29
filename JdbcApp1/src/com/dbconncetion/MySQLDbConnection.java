package com.dbconncetion;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySQLDbConnection {

	public static Connection getConnection() throws Exception
	{
		String currentWorkingDir = System.getProperty("user.dir");
		//System.out.println(currentWorkingDir);
		String path = currentWorkingDir + "\\src\\dbcon.properties";
		Properties prop = new Properties();
		InputStream in = new FileInputStream(path);
		prop.load(in);
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		in.close();
		
		//System.out.println(driver + "\t" + url + "\t" + user + "\t" + pwd);
		
		Connection conObj = null;
		try {
			Class.forName(driver);
			conObj = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return conObj;
	}	
}