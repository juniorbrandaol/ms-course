package com.eblj.hrworker.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eblj.hrworker.entities.Worker;
import com.eblj.hrworker.repositories.WorkerRepository;
import com.eblj.hrworker.services.WorkerService;

@Service
public class WorkerServiceImpl implements WorkerService{

	@Autowired
	private WorkerRepository repository;
	
	@Override
	public List<Worker> listAll() {
		return repository.findAll();
	}

	@Override
	public Worker listById(Long id) {
		return repository.findById(id).get();
	}

}
