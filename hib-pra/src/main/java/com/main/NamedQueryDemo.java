package com.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.config.JavaConfig;
import com.entity.EmployeewithAnnotation;

public class NamedQueryDemo {

	public static void main(String[] args) {

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();

		Query query = session.createNamedQuery("selectAll");
		List<EmployeewithAnnotation> list = query.list();
		System.out.println("=============================================");
		for (EmployeewithAnnotation emp : list) {
			System.out.println(emp.getId() + " : " + emp.getFirstName() + " : " + emp.getLastName() + " : "
					+ emp.getName() + " : " + emp.getSalary());
		}
		
		System.out.println("======select All End========================");
		
		Query query1 = session.createNamedQuery("selectById");
		query1.setParameter("e_id", 7);

		List<EmployeewithAnnotation> list1 = query1.list();
		System.out.println("=============================================");
		for (EmployeewithAnnotation emp : list1) {
			System.out.println(emp.getId() + " : " + emp.getFirstName() + " : " + emp.getLastName() + " : "
					+ emp.getName() + " : " + emp.getSalary());
		}
		
		// call stored procudure 
		
		List<EmployeewithAnnotation> list3 = session.getNamedQuery("getAllEmp").list();
		System.out.println("============calling procedure ===========");
		for (EmployeewithAnnotation emp : list3) {
			System.out.println(emp.getId() + " : " + emp.getFirstName() + " : " + emp.getLastName() + " : "
					+ emp.getName() + " : " + emp.getSalary());
		}
		

		session.close();

	}

}
