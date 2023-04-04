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

@RestController
@RequestMapping(value="/payments")
public class PaymentController {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value="/{workedId}/days/{days}")
	@ResponseStatus(value = HttpStatus.OK)
	public Payment getPayment( @PathVariable Long workedId,@PathVariable Integer days) {
		return service.getPayment(workedId, days);
	}

}
