package com.service;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.connections.DbConnection;
import com.entities.Employee;

import jakarta.persistence.TypedQuery;

public class TestService {

	SessionFactory sfact = null;
	
	public TestService()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void AddEmp(Employee emp)
	{
		Session session = sfact.openSession();
		Transaction  t = session.beginTransaction();
		session.persist(emp);
		t.commit();
	}
	
	public List<Employee>  ShowAll()
	{
		Session session = sfact.openSession();
		TypedQuery qry = session.createQuery("from Employee");
		List<Employee> emplist = qry.getResultList();
		return emplist;
	}
}
