package com.main.onetomanytest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.dao.DepartmentDao;
import com.entity.onetomany.Department;
import com.entity.onetomany.Employee;
import com.utils.DateUtils;

public class DeptTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DepartmentDao ddao = new DepartmentDao();
		
		Set<Employee> empSet1 = new HashSet<Employee>();
		Set<Employee> empSet2 = new HashSet<Employee>();
		
		Department d1 = new Department("HR", "Mumbai");
		Department d2 = new Department("IT", "Bangalore");
		
		Employee e1 = new Employee("Giri", "65000", DateUtils.convertStrDateToSqlDate("2020-11-05"), DateUtils.convertStrDateToSqlDate("1992-11-05"));
		Employee e2 = new Employee("Bhagya", "65000", DateUtils.convertStrDateToSqlDate("2019-11-05"), DateUtils.convertStrDateToSqlDate("1991-11-05"));
		Employee e3 = new Employee("Swati", "65000", DateUtils.convertStrDateToSqlDate("2015-11-05"), DateUtils.convertStrDateToSqlDate("1988-11-05"));
		Employee e4 = new Employee("Suman", "65000", DateUtils.convertStrDateToSqlDate("2021-11-05"), DateUtils.convertStrDateToSqlDate("1992-11-05"));
		Employee e5 = new Employee("Aswin", "65000", DateUtils.convertStrDateToSqlDate("2018-11-05"), DateUtils.convertStrDateToSqlDate("1992-11-05"));
		Employee e6 = new Employee("Pavan", "65000", DateUtils.convertStrDateToSqlDate("2020-11-05"), DateUtils.convertStrDateToSqlDate("1992-11-05"));
		Employee e7 = new Employee("Triven", "65000", DateUtils.convertStrDateToSqlDate("2020-11-05"), DateUtils.convertStrDateToSqlDate("1992-11-05"));
		
		empSet1.add(e1);
		empSet1.add(e2);
		empSet1.add(e3);
		//add the d1 to refereence to eabove empset
		e1.setDept(d1);
		e2.setDept(d1);
		e3.setDept(d1);
		
		
		// add above employees to d1
		
		d1.setEmpSet(empSet1);
		
		empSet2.add(e4);
		empSet2.add(e5);
		empSet2.add(e6);
		empSet2.add(e7);
		//add the d2 to refereence to eabove empset
		e4.setDept(d2);
		e5.setDept(d2);
		e6.setDept(d2);
		e7.setDept(d2);
		
		d2.setEmpSet(empSet2);
		
		//long i = ddao.saveDept(d1);
		//long j = ddao.saveDept(d2);
		//System.out.println("Record : "+i);
		//System.out.println("Record : "+j);
		System.out.println("=================================");
		
		Department d = ddao.fetchById(26L);
		
		System.out.println(d.getDname() + " : " + d.getEmpSet().size());
		
		Iterator<Employee> emp = d.getEmpSet().iterator();
		while(emp.hasNext()) {
			Employee e = emp.next();
			System.out.println(e.getEname() + " : "+e.getEsal()+":"+e.getDept().getDname() + " : "+e.getDoj());
		}
		
		
		
	}

}
