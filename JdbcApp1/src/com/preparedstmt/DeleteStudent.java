package com.preparedstmt;
import java.sql.*;
import java.util.Scanner;

import com.dbconncetion.MySQLDbConnection;

public class DeleteStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll Number ");
		int rno = sc.nextInt();
		
		try {
			Connection conObj = MySQLDbConnection.getConnection();
			
			conObj.setAutoCommit(false);
			
			PreparedStatement ps = conObj.prepareStatement("delete from student where rollno=?");
			ps.setInt(1, rno);
			ps.executeUpdate();
			
			System.out.println("Are u sure to delete(y/n): ");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("y"))
			{
				conObj.commit();
				System.out.println("Student is deleted....");
			}
			else
			{
				conObj.rollback();
				System.out.println("Student is Not deleted....");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
