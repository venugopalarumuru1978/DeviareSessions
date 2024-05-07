package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Address;
import com.entities.Employee;

public class EmpAdd {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp = new Employee();
		emp.setEmpno(102);
		emp.setEname("Kalyan");
		emp.setJob("Developer");
		emp.setSalary(15000.00f);
		
		Address  adrs = new Address(); 
		adrs.setAdrsid(12);
		adrs.setAdrsinfo("D.No. 12-13-B, Koti");
		adrs.setLocation("Hyderbad");
		
		emp.setAdrs(adrs);
		
		session.persist(emp);
		t.commit();
		
		System.out.println("Emp Data is Added...");
	}
}
