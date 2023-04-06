package com.eblj.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eblj.hroauth.entities.User;
import com.eblj.hroauth.feignclients.UserFeignClient;

@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
    private UserFeignClient userFeignClient;
	
	public User findByEmail(String email) {
		User user = userFeignClient.findByEmail(email);
		if(user==null) {
			logger.error("email not found "+email);
			throw new IllegalArgumentException("Email not found");
		}
		logger.info("Email found :"+email);
		return user;
	}

}
