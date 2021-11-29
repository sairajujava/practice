package com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Roles;

@Repository
public interface RolesRepository extends JpaRepository<Roles, Long> {
	
	public  Optional<Roles> findByName(String name);

	
}
 