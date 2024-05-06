package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

public class StdApp1 {

	public static void main(String[] args) {
		Student std = new Student();
		std.setRollno(1002);
		std.setSname("Pavan Kumar");
		std.setCourse("Java");
		std.setFees(12000.00f);
		
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
