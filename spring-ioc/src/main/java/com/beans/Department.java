package com.beans;

public class Department {

	private String deptName;

	private Employee emp;

	public Department(String deptName, Employee emp) {
		super();
		this.deptName = deptName;
		this.emp = emp;
	}
	
	public void showDepart() {
		System.out.println("DepartmentName :"+deptName);
		System.out.println("==========Injected Employee Details===========");
		System.out.println("Emp Name :"+emp.getEmpName());
		System.out.println("Emp Salary :"+emp.getSalary());
	}

}
