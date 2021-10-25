package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class EmpTest {

	public static void main(String[] args) {

		// load the hibernate.cfg.xml and build the session-factory

		Configuration config = new Configuration();
		SessionFactory sf = config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Swati");
		emp.setFirstName("SwatiFirstname");
		emp.setLastName("SwatiLastName");
		emp.setSalary("70000");

		session.save(emp);
		tx.commit();
		session.close();

	}

}
