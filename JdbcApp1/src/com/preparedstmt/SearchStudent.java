package com.preparedstmt;
import java.sql.*;
import java.util.Scanner;

import com.dbconncetion.MySQLDbConnection;
public class SearchStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number ");
		int rno = sc.nextInt();
		
		try {
			Connection conObj = MySQLDbConnection.getConnection();
			
			PreparedStatement ps = conObj.prepareStatement("Select * from Student where rollno=?");
			ps.setInt(1, rno);
			ResultSet rs = ps.executeQuery();
			
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
