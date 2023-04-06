package com.eblj.hroauth.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eblj.hroauth.entities.User;
import com.eblj.hroauth.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping(value="/email/{email}")
	@ResponseStatus(value = HttpStatus.OK)
	public User findByEmail(@PathVariable String email) {
		try {
			User user =  userService.findByEmail(email);
			return user;
		}catch(IllegalArgumentException e) {
			return null; 
		}
	
	}
	
	

}
