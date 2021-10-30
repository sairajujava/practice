package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.JavaConfig;
import com.entity.onetomany.Department;

public class DepartmentDao {

	public long saveDept(Department dept) {

		// Get the session object
		Long i = (long) 0;

		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		i = (Long) session.save(dept);
		tx.commit();
		session.close();

		return i;
	}

	public Department fetchById(long id) {
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Department dept = session.load(Department.class, id);
		return dept;
	}

}
