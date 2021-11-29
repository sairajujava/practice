package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.service.EmployeeService;
import com.utils.ObjectMapperUtils;
import com.vo.EmployeeVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@RestController
@Api(value = "EmployeeController", description = "API to manage Tenants. These API are consumed by Service Provider only")
@RequestMapping(value = "/emp")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@ApiOperation(value = "Creating tenant account with default user with admin role", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created tenant account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the tenant"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username is already registed") })
	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeVO> create(@RequestBody EmployeeVO employeeVO) {

		employeeService.save(ObjectMapperUtils.map(employeeVO, Employee.class));

		return new ResponseEntity<EmployeeVO>(employeeVO, HttpStatus.OK);

	}
	
	
	@ApiOperation(value = "Fetching all account with default user with admin role", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created tenant account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the tenant"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username is already registed") })
	@GetMapping(path = "/list", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeVO> fetchAll() {

		return ObjectMapperUtils.mapAll(employeeService.fetchAll(), EmployeeVO.class);
	}
	
	
	@GetMapping(value = "/byName/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "fetchByUsername user accounts with default", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created user account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the account"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username id is already registed") })
	public EmployeeVO fetchByUsername(@PathVariable("name") String name) {

		return ObjectMapperUtils.map(employeeService.getByName(name), EmployeeVO.class);
	}
	
	@ApiOperation(value = "update tenant account with default user with admin role", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created tenant account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the tenant"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username is already registed") })
	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeVO> update(@RequestBody EmployeeVO employeeVO) {

		employeeService.save(ObjectMapperUtils.map(employeeVO, Employee.class));

		return new ResponseEntity<EmployeeVO>(employeeVO, HttpStatus.OK);

	}
	
	@ApiOperation(value = "delete user account with default", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created user account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the account"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username id is already registed") })
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id){
		
		employeeService.delete(id);
		
		
		return new ResponseEntity<>("Record hasbeen deleted", HttpStatus.OK);
		
	}
	
	
	

}
