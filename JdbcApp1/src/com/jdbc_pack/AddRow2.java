package com.jdbc_pack;
import java.sql.*;
import java.util.*;
public class AddRow2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Roll Number ");
		int rno = sc.nextInt();
		
		System.out.println("Student Name ");
		String sname = sc.next();

		System.out.println("Student Course");
		String course = sc.next();

		System.out.println("Course Fees ");
		float fees = sc.nextFloat();

		String insert_cmd = "INSERT INTO STUDENT(ROLLNO, STDNAME, COURSE, FEES) VALUES("
					+ rno + ",'" + sname + "','" + course + "'," + fees + ")";
		
		System.out.println(insert_cmd);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/deviaredb2","root", "root");
			
			Statement  stmt = conObj.createStatement();
			stmt.executeUpdate(insert_cmd);
			
			System.out.println("New Student is Added....");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
