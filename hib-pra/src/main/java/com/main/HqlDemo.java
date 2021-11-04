package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.config.JavaConfig;
import com.entity.EmployeewithAnnotation;

public class HqlDemo {
	private static void select() {

		String hql_select = "FROM EmployeewithAnnotation";

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();

		// execute the sql query

		Query query = session.createQuery(hql_select);

		List<EmployeewithAnnotation> list = query.list();
		System.out.println("=============================================");
		for (EmployeewithAnnotation emp : list) {
			System.out.println(emp.getId() + " : " + emp.getFirstName() + " : " + emp.getLastName() + " : "
					+ emp.getName() + " : " + emp.getSalary());
		}

		session.close();

	}

	private static void selectFewColumns() {

		String hql_select = "SELECT e.name,e.salary FROM EmployeewithAnnotation e";
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();

		// execute the sql query

		Query query = session.createQuery(hql_select);

		List list = query.list();
		System.out.println("=============================================");
		System.out.println("List:" + list.size());

		for (int i = 0; i < list.size(); i++) {
			EmployeewithAnnotation emp = (EmployeewithAnnotation) list.get(i);
			System.out.println(emp.getName() + " : " + emp.getSalary());
		}

		session.close();

	}

	private static void selectById() {
		// TODO Auto-generated method stub

		String hql_select = "FROM EmployeewithAnnotation WHERE id=7";

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();

		// execute the sql query

		Query query = session.createQuery(hql_select);

		List<EmployeewithAnnotation> list = query.list();
		System.out.println("=============================================");
		for (EmployeewithAnnotation emp : list) {
			System.out.println(emp.getId() + " : " + emp.getFirstName() + " : " + emp.getLastName() + " : "
					+ emp.getName() + " : " + emp.getSalary());
		}

		session.close();
	}

	private static void orderBy() {

		String hql_select = "FROM EmployeewithAnnotation S WHERE S.id > 3 ORDER BY S.name ASC";

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();

		// execute the sql query

		Query query = session.createQuery(hql_select);

		List<EmployeewithAnnotation> list = query.list();
		System.out.println("=============================================");
		for (EmployeewithAnnotation emp : list) {
			System.out.println(emp.getId() + " : " + emp.getFirstName() + " : " + emp.getLastName() + " : "
					+ emp.getName() + " : " + emp.getSalary());
		}

		session.close();

	}

	private static void namedQueries() {

		String hql_select = "FROM EmployeewithAnnotation WHERE id=:e_id";

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();

		// execute the sql query

		Query query = session.createQuery(hql_select);
		query.setParameter("e_id", 7);

		List<EmployeewithAnnotation> list = query.list();
		System.out.println("=============================================");
		for (EmployeewithAnnotation emp : list) {
			System.out.println(emp.getId() + " : " + emp.getFirstName() + " : " + emp.getLastName() + " : "
					+ emp.getName() + " : " + emp.getSalary());
		}

		session.close();

	}

	private static void updateTable() {
		String hql_update = "UPDATE EmployeewithAnnotation set salary= :e_salary WHERE id = :e_id ";

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		// execute the sql query

		Query query = session.createQuery(hql_update);
		

		query.setParameter("e_salary", "50000");
		query.setParameter("e_id", 7);

		int i = query.executeUpdate();

		System.out.println("Updated:" + i);
		
		session.getTransaction().commit();

		session.close();

	}

	
	private static void delete() {
		
		String hql_update = "DELETE FROM EmployeewithAnnotation WHERE id=:e_id";

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		// execute the sql query

		Query query = session.createQuery(hql_update);
		query.setParameter("e_id", 5);

		int i = query.executeUpdate();

		System.out.println("Updated:" + i);
		
		session.getTransaction().commit();

		session.close();
		
	}
	private static void countSal() {
		
		String hql_select = "SELECT avg(S.salary) FROM EmployeewithAnnotation S";
		
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();

		// execute the sql query

		Query query = session.createQuery(hql_select);

		Object obj = query.uniqueResult();
		
		System.out.println(obj);

		session.close();
		
	}
	public static void main(String[] args) {

		// select();
		// selectFewColumns();
		// selectById();
		// orderBy();
		// namedQueries();
		//updateTable();
		//delete();
		countSal();

	}


}
