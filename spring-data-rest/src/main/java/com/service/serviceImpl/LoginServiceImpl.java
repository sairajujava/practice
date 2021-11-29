package com.service.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Roles;
import com.model.Users;
import com.repository.RolesRepository;
import com.repository.UsersRepository;
import com.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private RolesRepository rolesRepository;

	@Override
	public boolean isUserExist(String username) {
		return usersRepository.existsByUsername(username);
	}

	@Override
	public boolean isEmailExist(String email) {
		return usersRepository.existsByEmail(email);
	}

	@Override
	public Optional<Roles> isRoleExist(String name) {
		return rolesRepository.findByName(name);
	}

	@Override
	public void save(Users user) {
		usersRepository.save(user);
		
	}

}
