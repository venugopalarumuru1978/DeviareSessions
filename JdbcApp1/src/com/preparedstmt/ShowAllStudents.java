package com.preparedstmt;
import java.sql.*;

import com.dbconncetion.MySQLDbConnection;
public class ShowAllStudents {

	public static void main(String[] args) {
		
		try {
			Connection conObj = MySQLDbConnection.getConnection();
			
			PreparedStatement ps = conObj.prepareStatement("Select * from Student");
			ResultSet rs = ps.executeQuery();
			
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
