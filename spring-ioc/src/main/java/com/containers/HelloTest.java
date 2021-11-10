package com.containers;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.beans.HelloWorld;

public class HelloTest {

	public static void main(String[] args) {
		
		// Type 1 Container
		
		XmlBeanFactory bfactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		HelloWorld h = (HelloWorld) bfactory.getBean("hello");
		System.out.println(h.getMsg());
		
		
		// Type 2 Container
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld h1 = (HelloWorld) context.getBean("hello");
		System.out.println(h1.getMsg());

	}

}
