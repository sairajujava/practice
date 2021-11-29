package com.service;

import java.util.Optional;


import com.model.Roles;
import com.model.Users;

public interface LoginService {
	
	public boolean isUserExist(String username);
	public boolean isEmailExist(String email);
	public Optional<Roles> isRoleExist(String name);
	public void save(Users user);

}
