package com.apps;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.entities.Person;


import jakarta.persistence.TypedQuery;

public class ShowAllRows {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();

		TypedQuery  qry = session.createQuery("from Person");
		List<Person>  perlist = qry.getResultList();
		
		for(Person p : perlist)
		{
			System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getPhone());
		}
		
	}
}
