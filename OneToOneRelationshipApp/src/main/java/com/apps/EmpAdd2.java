package com.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Address2;
import com.entities.Employee2;
// Bi-directional process
public class EmpAdd2 {

	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Employee2 emp = new Employee2();
		emp.setEmpno(102);
		emp.setEname("Kalyan");
		emp.setJob("Developer");
		emp.setSalary(15000.00f);
		
		Address2  adrs = new Address2(); 
		adrs.setAdrsid(12);
		adrs.setAdrsinfo("D.No. 12-13-B, Koti");
		adrs.setLocation("Hyderbad");
		
		emp.setAdrs(adrs);
		adrs.setEmp(emp);
		
		session.persist(emp);
		t.commit();
		
		System.out.println("Emp Data is Added...");
	}
}
