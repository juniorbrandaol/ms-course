package com.eblj.hrworker.contollers;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eblj.hrworker.entities.Worker;
import com.eblj.hrworker.services.WorkerService;

@RestController
@RequestMapping(value="/workes")
public class WorkerController {
	
	private static Logger logger =  LoggerFactory.getLogger(WorkerController.class);
	
	@Autowired  
	private Environment env; // traz informações de todo o contexto da aplicação

	@Autowired
	private WorkerService service;
	
	@GetMapping
	@ResponseStatus(value = HttpStatus.OK)
	public List<Worker> findAll(){
		return service.listAll();
	}
	

	@GetMapping(value="/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public Worker findById( @PathVariable Long id){
		logger.info("Port = " + env.getProperty("local.server.port"));
		return service.listById(id);
	}
	
}
