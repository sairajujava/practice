package com.beans;

public class Department {

	private String deptName;

	private Employee emp;

	// Constructor DI

	/*
	 * public Department(String deptName, Employee emp) { super(); this.deptName =
	 * deptName; this.emp = emp; }
	 */

	public void showDepart() {
		System.out.println("DepartmentName :" + deptName);
		System.out.println("==========Injected Employee Details===========");
		System.out.println("Emp Name :" + emp.getEmpName());
		System.out.println("Emp Salary :" + emp.getSalary());
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

}
