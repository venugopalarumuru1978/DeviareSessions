package com.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.connections.DbConnection;
import com.entities.Student;

import jakarta.persistence.TypedQuery;

public class StudentService {

	SessionFactory sfact = null;
	
	public StudentService()
	{
		sfact = DbConnection.getConnection();
	}
	
	public void AddStudent(Student std)
	{
		Session session = sfact.openSession();
		Transaction trans = session.beginTransaction();
		session.persist(std);
		trans.commit();
	}
	
	public List<Student>  ShowAll()
	{
		Session session = sfact.openSession();
		TypedQuery qry = session.createQuery("from Student");
		List<Student> stdlist = qry.getResultList();
		return stdlist;
	}
	
	public Student SearchStudent(int rno)
	{
		Session session = sfact.openSession();
		Student std = session.get(Student.class, rno);
		return std;
	}
	
}
