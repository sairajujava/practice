package com.service;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.model.Roles;
import com.model.Users;
import com.repository.UsersRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	
	@Autowired
	private UsersRepository usersRepository;

	 @Override
	    public UserDetails loadUserByUsername(String usernameOrEmail) throws UsernameNotFoundException {
	       Users user = usersRepository.findByUsernameOrEmail(usernameOrEmail, usernameOrEmail)
	               .orElseThrow(() ->
	                       new UsernameNotFoundException("User not found with username or email:" + usernameOrEmail));
	        return new org.springframework.security.core.userdetails.User(user.getEmail(),
	                user.getPassword(), mapRolesToAuthorities(user.getRoles()));
	    }

	    private Collection< ? extends GrantedAuthority> mapRolesToAuthorities(Set<Roles> roles){
	        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	    }

}
