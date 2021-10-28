package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.JavaConfig;
import com.entity.onetoone.Customer;

public class CustomerDao {

	public Long saveCustomer(Customer cust) {

		// Get the session object
		Long i = (long) 0;

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		i = (Long) session.save(cust);
		tx.commit();
		session.close();

		return i;
	}

	public Customer fetchById(long id) {
		
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Customer cust = session.get(Customer.class, id);
		tx.commit();
		session.close();		
		return cust;
	}

	public void updateCustDetails(Customer cust) {
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(cust);
		tx.commit();
		session.close();	
		
	}

}
