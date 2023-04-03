package com.eblj.hrworker.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
		return service.listById(id);
	}
	
}
