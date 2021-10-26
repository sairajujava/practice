package com.main;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.JavaConfig;
import com.entity.EmployeewithAnnotation;

public class SessionWithMethodsDemo {

	private static void saveObject() {
		SessionFactory sf = JavaConfig.getSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		EmployeewithAnnotation emp = new EmployeewithAnnotation();
		emp.setName("Aswin");
		emp.setFirstName("Etta");
		emp.setLastName("AswinEtta");
		emp.setSalary("70000");
		int id = (int) session.save(emp);
		if (id > 0) {
			System.out.println("record hasbeen saved :" + id);
		}
		tx.commit();
		session.close();

	}

	private static void persistObj() {
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		EmployeewithAnnotation emp = new EmployeewithAnnotation();
		emp.setName("Aswin");
		emp.setFirstName("Etta");
		emp.setLastName("AswinEtta");
		emp.setSalary("70000");
		session.persist(emp);
		tx.commit();
		session.close();
		
	}
	private static void saveOrUpdate() {
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		// This part will be save the record if it is not present in the database
		/*
		 * EmployeewithAnnotation emp = new EmployeewithAnnotation();
		 * emp.setName("Ramesh"); emp.setFirstName("RameshFirstName");
		 * emp.setLastName("rameshburra"); emp.setSalary("70000");
		 * session.saveOrUpdate(emp);
		 */
		// This part will be update the record if it is  present in the database
		EmployeewithAnnotation emp = session.load(EmployeewithAnnotation.class, 5);
		emp.setFirstName("RameshFirstName");
		emp.setSalary("75000");
		session.saveOrUpdate(emp);
		tx.commit();
		session.close();
		
	}
	private static void merge() {
		
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		EmployeewithAnnotation emp = new EmployeewithAnnotation();
		emp.setName("Giri");
		emp.setFirstName("GiriReddy");
		emp.setLastName("GiriReddy");
		emp.setSalary("70000");
		session.save(emp);
		tx.commit();
		//session.close(); // session has been closed
		
		Session session2 = sf.openSession();
		Transaction tx2 = session.beginTransaction();
		emp.setFirstName("GR");
		session2.merge(emp);
		tx2.commit();
		session2.close();
		
		
	}
	
	
	
	public static void main(String[] args) {

		//saveObject();
		//persistObj();
		//saveOrUpdate();
		merge();
		

	}


}
