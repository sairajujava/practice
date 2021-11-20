package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	public Employee findByName(String name);

	@Modifying
	@Query("update Employee u set u.name = ?1, u.address = ?2 where u.id = ?3")
	public void updateEmpinfo(String name, String address, Long id);

}
