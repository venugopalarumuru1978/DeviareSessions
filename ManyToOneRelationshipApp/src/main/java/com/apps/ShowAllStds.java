package com.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Course;
import com.entities.Student;

import jakarta.persistence.TypedQuery;

public class ShowAllStds {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		TypedQuery qry = session.createQuery("from Student");
		List<Student>  stdlist = qry.getResultList();
		
		for(Student s : stdlist)
		{
			System.out.println("Roll Number : " + s.getRollno());
			System.out.println("Student Name : " + s.getSname());
			Course c = s.getCurs();
			System.out.println("Course Name : " + c.getCurname());
			System.out.println("Duration : " + c.getDuration() + " Months");
			System.out.println("Course Fees : " + c.getFees());
			System.out.println("--------------");
		}
	}
}
