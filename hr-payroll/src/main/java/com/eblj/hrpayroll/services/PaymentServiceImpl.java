package com.eblj.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eblj.hrpayroll.entities.Payment;
import com.eblj.hrpayroll.entities.Worker;
import com.eblj.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;

	@Override
	public Payment getPayment(Long workerId, Integer days) {
		
		Worker worker = workerFeignClient.findById(workerId);	
		return new Payment(worker.getName(),worker.getDailyIncome(),days);
	}

   
}
