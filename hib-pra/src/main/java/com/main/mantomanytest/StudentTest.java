package com.main.mantomanytest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.JavaConfig;
import com.entity.manytomany.Course;
import com.entity.manytomany.Student;
import com.utils.DateUtils;

public class StudentTest {

	public static void main(String[] args) {
		
		// get the seesionfactory
		
		SessionFactory sf = JavaConfig.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Student s1 = new Student("Giri", "9988776655", DateUtils.convertStrDateToSqlDate("1992-11-23"));
		Student s2 = new Student("Aswin", "9988776655", DateUtils.convertStrDateToSqlDate("1992-11-23"));
		Student s3 = new Student("Ramesh", "9988776655", DateUtils.convertStrDateToSqlDate("1992-11-23"));
		
		Course c1 = new Course("java",DateUtils.convertStrDateToSqlDate("2021-08-23") , "180");
		Course c2 = new Course("devops",DateUtils.convertStrDateToSqlDate("2021-08-23") , "90");
		Course c3 = new Course("python",DateUtils.convertStrDateToSqlDate("2021-08-23") , "180");
		
		// add course to student
		
		s1.getCset().add(c1);
		s1.getCset().add(c2);
		s2.getCset().add(c3);
		s2.getCset().add(c1);
		s3.getCset().add(c1);
		s3.getCset().add(c2);
		s3.getCset().add(c3);
		
		// add the students to course
		
		c1.getSset().add(s1);
		c1.getSset().add(s2);
		c1.getSset().add(s3);
		c2.getSset().add(s1);
		c2.getSset().add(s3);
		c3.getSset().add(s2);
		c3.getSset().add(s3);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.getTransaction().commit();
		session.close();
		
		

	}

}
