package com.apps;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Person;

public class PersonAdd {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Person person = new Person();
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Person ID : ");
		//person.setPid(sc.nextInt());
		
		System.out.println("Person Name : ");
		person.setPname(sc.next());
		
		System.out.println("Person Phone : ");
		person.setPhone(sc.next());
		
		session.persist(person);
		t.commit();
		
		System.out.println("Person Details are Added...");
	}
}
