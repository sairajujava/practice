package com.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {

	private String colName;

	@Autowired
	@Qualifier("stu1")
	private Student stu;

	public College(String colName, Student stu) {
		super();
		this.colName = colName;
		this.stu = stu;
	}

	public void showDetails() {
		System.out.println("College NAme :" + colName);
		System.out.println("======student details============");
		System.out.println(stu.getId() + " : " + stu.getName() + " : " + stu.getRank());
	}

}
