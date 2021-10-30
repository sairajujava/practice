package com.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "emp")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class EmployeewithAnnotation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "e_id")
	private int id;
	@Column(name = "e_name")
	private String name;
	@Column(name = "e_firstName")
	private String firstName;
	@Column(name = "e_lastName")
	private String lastName;
	@Column(name = "e_salary")
	private String salary;

	public EmployeewithAnnotation() {

	}

	public EmployeewithAnnotation(int id, String name, String firstName, String lastName, String salary) {
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
