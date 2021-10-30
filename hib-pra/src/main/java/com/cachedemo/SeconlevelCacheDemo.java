package com.cachedemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.JavaConfig;
import com.entity.EmployeewithAnnotation;

public class SeconlevelCacheDemo {

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
				
				session1.getTransaction().commit();
				session1.close();
				

	}

}
