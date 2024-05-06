package com.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class StdApp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		
		System.out.println("Roll Number : ");
		std.setRollno(sc.nextInt());
		
		System.out.println("Student Name : ");
		std.setSname(sc.next());

		System.out.println("Course : ");
		std.setCourse(sc.next());

		System.out.println("Course Fees : ");
		std.setFees(sc.nextFloat());

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		session.persist(std);
		t.commit();
		
		System.out.println("Data Saved in Db...");
	}
}
