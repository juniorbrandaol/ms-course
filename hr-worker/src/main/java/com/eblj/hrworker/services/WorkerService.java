package com.eblj.hrworker.services;

import java.util.List;

import com.eblj.hrworker.entities.Worker;

public interface WorkerService {
	
	List<Worker> listAll(); 
	Worker listById(Long id);

}
