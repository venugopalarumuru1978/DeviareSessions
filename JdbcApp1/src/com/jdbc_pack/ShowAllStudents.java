package com.jdbc_pack;
import java.sql.*;
public class ShowAllStudents {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/deviaredb2","root", "root");
			
			Statement stmt = conObj.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Student");
			
			while(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("rollno"));
				System.out.println("Student Name : " + rs.getString("stdname"));
				System.out.println("Student Course : " + rs.getString("course"));
				System.out.println("Course Fees : " + rs.getFloat("fees"));
				System.out.println("--------------------");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
