package com.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Student;

import jakarta.persistence.TypedQuery;

public class ShowAllRows {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();

		/*
		 * SQL : select * from Student; - Student is table name
		 * HQL : from Student - Student is a class name		
		 */
		
		TypedQuery  qry = session.createQuery("from Student");
		List<Student>  stdlist = qry.getResultList();
		
		for(Student std : stdlist)
		{
			System.out.println(std.getRollno() + "\t" + std.getSname() + "\t" + std.getCourse() + "\t" + std.getFees());
		}
		
	}
}
