package com.preparedstmt;
import java.sql.*;
import java.util.Scanner;

import com.dbconncetion.MySQLDbConnection;
public class UpdateStudentName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number ");
		int rno = sc.nextInt();
		
		System.out.println("Enter New Name of the Student ");
		String sname = sc.next();
		
		try {
			Connection conObj = MySQLDbConnection.getConnection();
			
			conObj.setAutoCommit(false);
			
			PreparedStatement ps = conObj.prepareStatement("update student set stdname=? where rollno=?");
			ps.setString(1, sname);
			ps.setInt(2, rno);
			ps.executeUpdate();
			
			System.out.println("Are u sure to Update(y/n): ");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("y"))
			{
				conObj.commit();
				System.out.println("Student Name is Updated....");
			}
			else
			{
				conObj.rollback();
				System.out.println("Student Name is Not Updated....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}