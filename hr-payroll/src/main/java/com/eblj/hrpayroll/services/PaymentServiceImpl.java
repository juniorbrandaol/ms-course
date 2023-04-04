package com.eblj.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.eblj.hrpayroll.entities.Payment;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Override
	public Payment getPayment(Long WorkId, Integer days) {
		
		return new Payment("Bob",200.00,days);
	}

   
}
