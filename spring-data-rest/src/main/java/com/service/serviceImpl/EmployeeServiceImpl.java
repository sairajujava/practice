package com.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;
import com.repository.EmployeeRepository;
import com.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee save(Employee emp) {
		
		return employeeRepository.save(emp);
	}

	@Override
	public List<Employee> fetchAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getByName(String name) {
		return employeeRepository.findByName(name);
	}

}
