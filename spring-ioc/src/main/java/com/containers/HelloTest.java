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
		h.setMsg("Welcome to SpringWorld...!");
		System.out.println(h.getMsg());
		
		HelloWorld h2 = (HelloWorld) bfactory.getBean("hello");
		System.out.println(h2.getMsg());
		
		HelloWorld h4 = (HelloWorld) bfactory.getBean("hello");
		System.out.println(h4.getMsg());
		
		
		// Type 2 Container
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld h1 = (HelloWorld) context.getBean("hello");
		h1.setMsg("Welcome to SpringWorld...!");
		System.out.println(h1.getMsg());
		
		HelloWorld h3 = (HelloWorld) context.getBean("hello");
		System.out.println(h3.getMsg());


	}

}
