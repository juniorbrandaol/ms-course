package com.eblj.hrpayroll.services;

import com.eblj.hrpayroll.entities.Payment;

public interface PaymentService {
	
	 Payment getPayment(Long WorkId, Integer days);	

}
