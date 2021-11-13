package com.containers;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.beans.College;

public class CollegeTest {

	public static void main(String[] args) {

		// Type 1 Container

		//XmlBeanFactory bfactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));

		//College d = (College) bfactory.getBean("col");

		//d.showDetails();

		// Type 2 Container
		
		System.out.println("==============ApplicationContext======================================");

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		College d1 = (College) context.getBean("col");

		d1.showDetails();


	}

}
