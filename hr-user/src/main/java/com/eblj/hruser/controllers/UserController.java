package com.eblj.hruser.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eblj.hruser.entities.User;
import com.eblj.hruser.services.UserService;

@RestController
@RequestMapping(value="/users")
public class UserController {
	
    @Autowired
	private UserService service;
	
	@GetMapping(value="/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public User findById( @PathVariable Long id){
		return service.findById(id);
	}
	
	@GetMapping(value="/email/{email}")
	@ResponseStatus(value = HttpStatus.OK)
	public User findByEmail( @PathVariable String email){
		return service.findByEmail(email);
	}

}
