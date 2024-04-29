package com.jdbc_pack;
import java.sql.*;
import java.util.Scanner;
public class SearchStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number ");
		int rno = sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/deviaredb2","root", "root");
			
			Statement stmt = conObj.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from Student where rollno=" + rno);
			
			if(rs.next())
			{
				System.out.println("Roll Number : " + rs.getInt("rollno"));
				System.out.println("Student Name : " + rs.getString("stdname"));
				System.out.println("Student Course : " + rs.getString("course"));
				System.out.println("Course Fees : " + rs.getFloat("fees"));
			}
			else
				System.out.println("Student Not Found....");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
