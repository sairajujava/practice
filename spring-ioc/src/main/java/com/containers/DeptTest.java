package com.containers;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.beans.Department;

public class DeptTest {

	public static void main(String[] args) {

		// Type 1 Container

		XmlBeanFactory bfactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

		Department d = (Department) bfactory.getBean("dept");

		d.showDepart();
		d.showDepart();

		// Type 2 Container
		
		System.out.println("==============ApplicationContext======================================");

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Department d1 = (Department) context.getBean("dept");

		d1.showDepart();

	}

}
