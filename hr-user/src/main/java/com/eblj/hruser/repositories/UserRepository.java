package com.eblj.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eblj.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);
}
