package com.app.aforo255.loan.payment.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.aforo255.loan.payment.entity.LoanPaymentSchecule;
import com.app.aforo255.loan.payment.producer.LoanPaymentEventProducer;
import com.app.aforo255.loan.payment.service.ILoanPaymentService;

import org.slf4j.*;
@RestController
public class LoanPaymentController {

	private Logger log = LoggerFactory.getLogger(LoanPaymentController.class);
	@Autowired
	LoanPaymentEventProducer eventProducer;
	@Autowired
	private ILoanPaymentService service;
	
	@PostMapping("/loan/pay")
	public ResponseEntity<LoanPaymentSchecule> postLibraryEvent(@RequestBody LoanPaymentSchecule payment) throws Exception{
		
		LoanPaymentSchecule tranSql = service.loanPayment(payment);
		
		log.info("antes sendEventApproach3");
		eventProducer.sendEventApproach3(tranSql);
		log.info("despues sendEventApproach3");	
		
		return ResponseEntity.status(HttpStatus.OK).body(tranSql);
		
	}
	
}

