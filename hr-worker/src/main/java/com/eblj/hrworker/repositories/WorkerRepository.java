package com.eblj.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eblj.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
  
}
