package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {
	
	public Employee save(Employee emp);

	public List<Employee> fetchAll();

	public Employee getByName(String name);

}
