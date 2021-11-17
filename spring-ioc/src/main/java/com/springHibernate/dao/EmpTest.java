package com.springHibernate.dao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springHibernate.entity.Employee;

public class EmpTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeDao edao = (EmployeeDao) context.getBean("emp");
		
		Employee emp = new Employee();
		emp.setName("Pavan");
		emp.setSalary("60000");
		emp.setDob("12-11-1991");
		//Integer i = (Integer) edao.saveEmp(emp);
		//System.out.println("Record hasbeen saved:"+i);
		
		System.out.println("====================================");
		
		List<Employee>empList = edao.fetchAll();
		
		for(Employee em : empList) {
			System.out.println(em.getId() + " : " + em.getName() + " : " + em.getSalary() + " : " + em.getDob());
		}
		
		System.out.println("====================================");
		
		Employee em = edao.getById(50);
		
		System.out.println("Employee:"+em.toString());
		//System.out.println(em.getId() + " : " + em.getName() + " : " + em.getSalary() + " : " + em.getDob());
		
		Employee e = new Employee();
		e.setId(49);
		e.setName("Aswin");
		e.setSalary("60000");
		e.setDob("12-11-1991");
	    edao.updateEmp(e);
		
	}

}
