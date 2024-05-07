package com.apps;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;
import com.entities.Projects;

import jakarta.persistence.TypedQuery;

public class ProjectSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Project ID ");
		int pid = sc.nextInt();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		TypedQuery  qry = session.createQuery("from Projects where prjId=:pid");
		qry.setParameter("pid", pid);
		List<Projects>  prjinfo = qry.getResultList();
		
		if(prjinfo.isEmpty())
		{
			System.out.println("No Projects found ....");
		}
		else
		{
					Projects p = prjinfo.get(0);
					System.out.println(p.getPrjName());
					List<Employee>  emplist = p.getEmpinfo();
					for(Employee e : emplist)
					{
						System.out.println(e.getEname());
					}
		}
	}
}
