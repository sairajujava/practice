package com.springJdbc.dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springJdbc.beans.University;

public class UniversityTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UniversityDao udao = (UniversityDao) context.getBean("uni");
		
		University uni = new University();
		uni.setName("JNTU");
		uni.setLoc("Hyderabad");
		uni.setMappedCol("5000");
		
		int i = udao.saveUniversity(uni);
		System.out.println("Record hasbeen saved:"+i);

	}

}
