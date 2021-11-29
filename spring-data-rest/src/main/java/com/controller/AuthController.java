package com.controller;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.LoginDto;
import com.dto.SignupDto;
import com.model.Roles;
import com.model.Users;
import com.repository.RolesRepository;
import com.service.LoginService;
import com.vo.EmployeeVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;

@RestController
@RequestMapping("/api/auth")
@Api(value = "AuthController", description = "API to manage Users. These API are consumed by users Provider only")
public class AuthController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private RolesRepository rolesRepository;
	
    @Autowired
	private PasswordEncoder passwordEncoder;

	@ApiOperation(value = "Register user account with default user with admin role", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created tenant account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the tenant"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username is already registed") })
	@PostMapping(path = "/signup", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> register(@RequestBody SignupDto signupDto) {

		// validate username
		
		  if (loginService.isUserExist(signupDto.getUsername())) {
		  
		  return new ResponseEntity<>("username is already existed...!",
		  HttpStatus.BAD_REQUEST);
		  
		  }
		  
		  // validate email
		  
		  if (loginService.isEmailExist(signupDto.getEmail())) {
		  
		  return new ResponseEntity<>("Email is already existed...!",
		  HttpStatus.BAD_REQUEST);
		  
		  }
		 

		// if not exist the users data then save

		Users user = new Users();
		user.setName(signupDto.getName());
		user.setUsername(signupDto.getUsername());
		user.setPassword(passwordEncoder.encode(signupDto.getPassword()));
		user.setEmail(signupDto.getEmail());

		Roles role = rolesRepository.findByName("ROLE_CUSTOMER").get();
		user.setRoles(Collections.singleton(role));

		loginService.save(user);

		return new ResponseEntity<>("user successfully registered...!", HttpStatus.OK);

	}

	@ApiOperation(value = "login user account with default user with admin role", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created tenant account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the tenant"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username is already registed") })
	@PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> login(@Valid @RequestBody LoginDto loginDto) {

		// do authenticate username and password

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginDto.getUsernameOrEmail(), loginDto.getPassword()));
		// if authentication is done the nad those to server security context
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return new ResponseEntity<>("User signed-in successfully!.", HttpStatus.OK);
	}
	
	@ApiOperation(value = "login user account with default user with admin role", authorizations = {
			@Authorization(value = "authToken") }, response = EmployeeVO.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfully created tenant account"),
			@ApiResponse(code = 401, message = "You are not authorized to create the tenant"),
			@ApiResponse(code = 404, message = "Resource not found"),
			@ApiResponse(code = 409, message = "username is already registed") })
	@PostMapping(path = "/logout",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> logout(HttpServletRequest request , HttpServletResponse response) {

		  Authentication auth = SecurityContextHolder.getContext().getAuthentication();  
	        if (auth != null){      
	           new SecurityContextLogoutHandler().logout(request, response, auth);  
	        }  
		return new ResponseEntity<>("User logged-out successfully!.", HttpStatus.OK);
	}

}
