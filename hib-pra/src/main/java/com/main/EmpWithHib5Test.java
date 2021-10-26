package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.config.JavaConfig;
import com.entity.Employee;
import com.entity.EmployeewithAnnotation;

public class EmpWithHib5Test {

	public static void main(String[] args) {

		// load the hibernate.cfg.xml and build the session-factory

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		EmployeewithAnnotation emp = new EmployeewithAnnotation(); // transient
		emp.setId(100);
		emp.setName("Swati");
		emp.setFirstName("SwatiFirstname");
		emp.setLastName("SwatiLastName");
		emp.setSalary("70000");

		session.save(emp); // persistent
		tx.commit();
		session.close();

	}

}
