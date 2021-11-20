package com;

import java.util.List;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.model.Employee;
import com.repository.EmployeeRepository;
import com.utils.DateUtils;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SpringDataRestApplicationTests {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Test
	public void saveEmp() {

		Employee emp = Employee.builder().id(100L).name("Swati").salary("60000").address("Pune")
				.dob(DateUtils.convertStrDateToSqlDate("1990-10-23"))
				.doj(DateUtils.convertStrDateToSqlDate("2021-10-23")).build();
		
		emp.se

		employeeRepository.save(emp);

	}

	@Test
	public void fetchAll() {

		List<Employee> empList = employeeRepository.findAll();

		for (Employee emp : empList) {
			System.out.println(emp);
		}

	}

	@Test
	public void fetchBuId() {

		Employee emp = employeeRepository.findByName("Aswin");

		System.out.println(emp);

	}

	@Test
	public void updateEmp() {

		Employee emp = Employee.builder().id(4L).name("Giri").salary("60000").address("Proddatur")
				.dob(DateUtils.convertStrDateToSqlDate("1990-10-23"))
				.doj(DateUtils.convertStrDateToSqlDate("2021-10-23")).build();

		// Type 1
		employeeRepository.save(emp);

		// Type 2
		// employeeRepository.updateEmpinfo("Janaki","Proddatur" ,5L);

	}

}
