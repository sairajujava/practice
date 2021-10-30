package com.cachedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.JavaConfig;
import com.entity.EmployeewithAnnotation;

public class FirstlevelCacheTest {

	public static void main(String[] args) {
		
		// Get the sf
		
		SessionFactory sf = JavaConfig.getSessionFactory();
		
		// first session open
		Session session1 = sf.openSession();
		session1.beginTransaction();
		
		EmployeewithAnnotation emp = session1.load(EmployeewithAnnotation.class, 5);
		System.out.println("=======================First Time session1===============================");
		System.out.println(emp.getName() + " : " + emp.getSalary());
		
		System.out.println("==================Second Time with same session1================");
		EmployeewithAnnotation emp1 = session1.load(EmployeewithAnnotation.class, 5);
		System.out.println(emp1.getName() + " : " + emp1.getSalary());
		
		
		// evict() the session  cache stored object
		
		session1.evict(emp1);
		System.out.println("==========After evict From Cache=================");
		
		System.out.println("==================Second Time with same session1================");
		EmployeewithAnnotation emp4 = session1.load(EmployeewithAnnotation.class, 5);
		System.out.println(emp4.getName() + " : " + emp4.getSalary());
		
		
		
		session1.getTransaction().commit();
		session1.close();
		
		Session session2 = sf.openSession();
		session2.beginTransaction();
		
		EmployeewithAnnotation emp2 = session2.load(EmployeewithAnnotation.class, 6);
		System.out.println("=======================First Time session2===============================");
		System.out.println(emp2.getName() + " : " + emp2.getSalary());
		
		System.out.println("==================Second Time with same session2================");
		EmployeewithAnnotation emp3 = session2.load(EmployeewithAnnotation.class, 6);
		System.out.println(emp3.getName() + " : " + emp3.getSalary());
		
		session2.getTransaction().commit();
		session2.close();
		
		

	}

}
