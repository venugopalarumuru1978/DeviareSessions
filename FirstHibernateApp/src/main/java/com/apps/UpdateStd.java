package com.apps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

import jakarta.persistence.TypedQuery;

public class UpdateStd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Roll Number : ");
		int rnumber = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		/*
		 * SQL : select * from Student where rollno=101; - Student is table name and rollno is col name
		 * HQL : from Student where rollno = 101 - Student is a class name and rollno is variable		
		 */
		
		TypedQuery  qry = session.createQuery("from Student where rollno=:rno");
		qry.setParameter("rno", rnumber);
		List<Student>  stdlist = qry.getResultList();
		
		if(stdlist.isEmpty())
			System.out.println("No Student is exist with given rollno");
		else
		{
			System.out.println("Present Name of the Student " + stdlist.get(0).getSname());
			
			System.out.println("New Name of the Student : ");
			String sname = sc.next();

			TypedQuery uptqry = session.createQuery("Update Student set sname=:sna where rollno=:rno");
			uptqry.setParameter("rno", rnumber);
			uptqry.setParameter("sna", sname);
			uptqry.executeUpdate();
			trans.commit();
			System.out.println("Student is Updated...");
		}		
	}
}
