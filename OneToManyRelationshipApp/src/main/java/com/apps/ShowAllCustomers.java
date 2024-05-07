package com.apps;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entities.BankAccount;
import com.entities.Customer;

import jakarta.persistence.TypedQuery;

public class ShowAllCustomers {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		TypedQuery  qry = session.createQuery("from Customer");
		List<Customer>  custlist = qry.getResultList();
		
		for(Customer c : custlist)
		{
			System.out.println("Customer ID : " + c.getCusid());
			System.out.println("Customer Name : " + c.getCusname());
			System.out.println("Customer Location : " + c.getLocation());
			System.out.println("Bank Accounts : ");
			
			List<BankAccount>  bainfo = c.getAccinfo();
			
			for(BankAccount b :  bainfo)
			{
				System.out.println("Account Number : " + b.getAccno());
				System.out.println("Bank Name : " + b.getBankname());
			}
			System.out.println("----------------------");
		}
	}

}
