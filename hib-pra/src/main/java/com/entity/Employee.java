package com.entity;

public class Employee {

	private int id;
	private String name;
	private String firstName;
	private String lastName;
	private String salary;

	public Employee() {

	}

	public Employee(int id, String name, String firstName, String lastName, String salary) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

}
