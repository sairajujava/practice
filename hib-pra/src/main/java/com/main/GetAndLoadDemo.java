package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.JavaConfig;
import com.entity.EmployeewithAnnotation;

public class GetAndLoadDemo {

	public static void main(String[] args) {

		// Ftching starategies using load() & get()

		SessionFactory sf = JavaConfig.getSessionFactory();

		// open the session

		Session session = sf.openSession();

		// get()

		EmployeewithAnnotation emp = session.get(EmployeewithAnnotation.class, 1);

		System.out.println("get() -----> Employee :" + emp.toString());

		// load()

		EmployeewithAnnotation emp1 = session.load(EmployeewithAnnotation.class, 2);

		System.out.println("load() -----> Employee :" + emp1.toString());
		
		// byId()
		
		EmployeewithAnnotation emp2  = session.byId(EmployeewithAnnotation.class).getReference(3);
		
		System.out.println("byId() ========>:"+emp2.toString());

	}

}
