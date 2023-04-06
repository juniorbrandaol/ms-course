package com.eblj.hruser.services;

import com.eblj.hruser.entities.User;

public interface UserService {
	
	User findById(Long id);
	User findByEmail(String email);

}
