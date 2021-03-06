package com.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.entity.EmployeewithAnnotation;
import com.entity.manytomany.Course;
import com.entity.manytomany.Student;
import com.entity.onetomany.Department;
import com.entity.onetomany.Employee;
import com.entity.onetoone.Customer;
import com.entity.onetoone.CustomerDetails;

public class JavaConfig {

	public static SessionFactory sf = null;

	public static SessionFactory getSessionFactory() {

		try {

			if (sf == null) {

				// create an object to configuration class

				Configuration cfg = new Configuration();

				// create one properties file

				Properties prop = new Properties();

				prop.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
				prop.put(Environment.URL, "jdbc:mysql://localhost:3306/hibpra?useSSL=false");
				prop.put(Environment.USER, "root");
				prop.put(Environment.PASS, "root");
				prop.put(Environment.POOL_SIZE, "10");
				prop.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
				prop.put(Environment.SHOW_SQL, true);
				prop.put(Environment.HBM2DDL_AUTO, "update");
				prop.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				// add properties for secondlevel cache

				prop.put(Environment.USE_SECOND_LEVEL_CACHE, true);
				prop.put(Environment.CACHE_REGION_FACTORY, "org.hibernate.cache.ehcache.EhCacheRegionFactory");

				// add all the properties to configuration class

				cfg.setProperties(prop);
				// add all entity classes to config
				cfg.addAnnotatedClass(EmployeewithAnnotation.class);
				// OneToOne
				cfg.addAnnotatedClass(Customer.class);
				cfg.addAnnotatedClass(CustomerDetails.class);

				// OneToMany
				cfg.addAnnotatedClass(Department.class);
				cfg.addAnnotatedClass(Employee.class);

				// ManyToMany
				cfg.addAnnotatedClass(Student.class);
				cfg.addAnnotatedClass(Course.class);

				// map all the annatated entity classes

				// create an object to standrdservice class

				ServiceRegistry sregistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
						.build();

				// build sessionfactory

				sf = cfg.buildSessionFactory(sregistry);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return sf;
	}

}
