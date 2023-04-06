package com.eblj.hruser.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eblj.hruser.entities.User;
import com.eblj.hruser.repositories.UserRepository;
import com.eblj.hruser.services.UserService;


@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	@Transactional(readOnly = true)
	public User findById(Long id) {		
		User obj = repository.findById(id).get();
		return obj;
	}

	@Override
	@Transactional(readOnly = true)
	public User findByEmail(String email) {
		User obj = repository.findByEmail(email);
		return obj;
	}

}
