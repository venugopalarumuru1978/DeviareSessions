package com.jdbc_pack;
import java.sql.*;
public class AddRow {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/deviaredb2","root", "root");
			
			Statement  stmt = conObj.createStatement();
			stmt.executeUpdate("INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES(1001, 'Pavan', 'Java', 15000.00)");
			
			System.out.println("New Student is Added....");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}