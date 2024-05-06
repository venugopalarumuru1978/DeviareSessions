package com.apps;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Person;

public class SearchPerson {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Person ID : ");
		int pno = sc.nextInt();
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();		
		Session session = sf.openSession();
		// Searching
		Person p = session.get(Person.class, pno);
		
		if(p!=null)
		{
			System.out.println(p.getPid() + "\t" + p.getPname() + "\t" + p.getPhone());
		}
		else
			System.out.println("No Person exist with given number");
	}
}
