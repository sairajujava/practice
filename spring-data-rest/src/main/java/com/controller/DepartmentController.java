package com.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Employee;
import com.utils.ObjectMapperUtils;
import com.vo.EmployeeVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@RestController
@Api(value = "DepartmentController", description = "API to manage Tenants. These API are consumed by Service Provider only")
@RequestMapping(value = "/dept")
public class DepartmentController {
	
	
	@ApiOperation(value = "Creating tenant account with default user with admin role", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created tenant account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the tenant"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username is already registed") })
	@PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> create(@RequestBody EmployeeVO employeeVO) {


		return new ResponseEntity<>("Record hasbeen saved", HttpStatus.OK);

	}
	

}
