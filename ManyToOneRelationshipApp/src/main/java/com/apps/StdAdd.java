package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Student;

public class StdAdd {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		Course course = new Course();
		course.setCurid(12);
		course.setCurname("Python FSD");
		course.setDuration(12);
		course.setFees(60000.00f);
		
		Student std1 = new Student();
		std1.setRollno(104);
		std1.setSname("Mahesh");
		std1.setCurs(course);
		
		Student std2 = new Student();
		std2.setRollno(105);
		std2.setSname("Ramesh");
		std2.setCurs(course);

		Student std3 = new Student();
		std3.setRollno(106);
		std3.setSname("Naresh");
		std3.setCurs(course);

		session.persist(std1);
		session.persist(std2);
		session.persist(std3);
		
		t.commit();
		
		System.out.println("Student Info Saved...");
	}
}
