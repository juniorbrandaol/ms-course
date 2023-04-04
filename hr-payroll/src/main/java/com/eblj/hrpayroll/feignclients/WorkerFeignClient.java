package com.eblj.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.eblj.hrpayroll.entities.Worker;

@Component
@FeignClient(name="hr-worker",url="localhost:8001",path="/workes")
public interface WorkerFeignClient {
	
	@GetMapping(value="/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	Worker findById( @PathVariable Long id);

}
