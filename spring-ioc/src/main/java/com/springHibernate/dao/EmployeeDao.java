package com.springHibernate.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springHibernate.entity.Employee;

public class EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibtemplate;

	public void setHibtemplate(HibernateTemplate hibtemplate) {
		this.hibtemplate = hibtemplate;
	}
	
	@Transactional
	public Serializable saveEmp(Employee emp) {
		
		return hibtemplate.save(emp);
	}

	@Transactional
	public List<Employee> fetchAll() {
		
		List<Employee> list = new ArrayList<Employee>();
		
		list = hibtemplate.loadAll(Employee.class);
		
		return list;
	}

	@Transactional
	public Employee getById(int id) {
		
		Employee emp = (Employee)hibtemplate.get(Employee.class, id);
		return emp;
	}

	@Transactional
	public void updateEmp(Employee emp) {
		
		hibtemplate.update(emp);
		
	}
	
	
	
	

}
