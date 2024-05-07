package com.apps;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;
import com.entities.Projects;

public class EmpAdd {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Employee emp1  = new Employee();
		emp1.setEmpno(1234);
		emp1.setEname("Prakash");

		Employee emp2  = new Employee();
		emp2.setEmpno(1235);
		emp2.setEname("Akash");
		
		Projects prj1 = new Projects();
		prj1.setPrjId(11);
		prj1.setPrjName("Student Management System");
		
		Projects prj2 = new Projects();
		prj2.setPrjId(12);
		prj2.setPrjName("Library Management System");

		List<Employee>  emplist = new ArrayList<Employee>();
		emplist.add(emp1);
		emplist.add(emp2);
		
		List<Projects>  prjlist = new ArrayList<Projects>();
		prjlist.add(prj1);
		prjlist.add(prj2);
		
		emp1.setPrjinfo(prjlist);
		emp2.setPrjinfo(prjlist);
		
		prj1.setEmpinfo(emplist);
		prj2.setEmpinfo(emplist);
		
		session.persist(emp1);
		session.persist(emp2);
		
		t.commit();
		
		System.out.println("Emp Info Saved...");	
	}
}
