package com.jdbc_pack;
import java.sql.*;
public class DbConnEx {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/deviaredb2","root", "root");
			
			if(conObj!=null)
				System.out.println("Db Connected...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
