package com.apps;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;
import com.entities.Projects;

import jakarta.persistence.TypedQuery;

public class EmpAll {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		TypedQuery  qry = session.createQuery("from Employee");
		List<Employee>  empinfo = qry.getResultList();
		
		if(empinfo.isEmpty())
		{
			System.out.println("No employee found ....");
		}
		else
		{
				for(Employee e : empinfo)
				{
					System.out.println("Employee Name : "+ e.getEname());
				
					List<Projects>  pjinfo = e.getPrjinfo();
					System.out.println("Project Info : ");
					for(Projects p : pjinfo)
					{
						System.out.println(p.getPrjName());
					}
				}
		}
	}
}
