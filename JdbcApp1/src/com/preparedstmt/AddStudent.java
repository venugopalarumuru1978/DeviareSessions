package com.preparedstmt;
import java.sql.*;
import java.util.*;

import com.dbconncetion.MySQLDbConnection;
public class AddStudent {

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
				
		try {
			Connection conObj = MySQLDbConnection.getConnection(); 
			
			PreparedStatement ps = conObj.prepareStatement("Insert into student(rollno, stdname, course, fees) values(?,?,?,?)");
			ps.setInt(1, rno);
			ps.setString(2, sname);
			ps.setString(3, course);
			ps.setFloat(4, fees);
			ps.executeUpdate();
			
			System.out.println("New Student is Added....");
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
