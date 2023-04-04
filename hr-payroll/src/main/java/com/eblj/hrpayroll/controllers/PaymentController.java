package com.eblj.hrpayroll.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.eblj.hrpayroll.entities.Payment;
import com.eblj.hrpayroll.services.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping(value="/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value="/{workedId}/days/{days}")
	@ResponseStatus(value = HttpStatus.OK)
	public Payment getPayment( @PathVariable Long workedId,@PathVariable Integer days) {
		Payment payment = service.getPayment(workedId,days);
		return payment;
	}
	
	public Payment getPaymentAlternative( Long workedId,@PathVariable Integer days) {
		Payment payment = new Payment("Junior Brandão",450.0,days);
		return payment;
	}
	
	

}
