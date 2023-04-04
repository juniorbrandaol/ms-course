package com.eblj.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.eblj.hrpayroll.entities.Payment;
import com.eblj.hrpayroll.entities.Worker;

@Service
public class PaymentServiceImpl implements PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Payment getPayment(Long workerId, Integer days) {
		
		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("id",""+workerId);
		
		Worker worker = restTemplate.getForObject(workerHost+"/workes/{id}",Worker.class,uriVariables);	
		return new Payment(worker.getName(),worker.getDailyIncome(),days);
	}

   
}
