package com.apps;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.BankAccount;
import com.entities.Customer;

public class CustomerAdd {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		
		Customer cust1 = new Customer();
		cust1.setCusid(122);
		cust1.setCusname("Kalyan Kumar");
		cust1.setLocation("Hyderabad");
		
		List<BankAccount>  accinfo = new ArrayList<BankAccount>();
		
		BankAccount ba = new BankAccount();
		
		ba.setBaid(4);
		ba.setAccno("ACC007");
		ba.setBankname("SBI");
		accinfo.add(ba);
		
		ba = new BankAccount();
		ba.setBaid(7);
		ba.setAccno("ACC009");
		ba.setBankname("ICICI");
		accinfo.add(ba);
		
		ba = new BankAccount();
		ba.setBaid(13);
		ba.setAccno("ACC0013");
		ba.setBankname("YES");
		accinfo.add(ba);
		
		cust1.setAccinfo(accinfo);
		
		session.persist(cust1);
		t.commit();
		
		System.out.println("Customer is Added...");
	}

}
