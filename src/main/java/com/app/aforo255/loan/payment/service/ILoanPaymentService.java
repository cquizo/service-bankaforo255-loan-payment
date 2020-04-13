package com.app.aforo255.loan.payment.service;

import com.app.aforo255.loan.payment.entity.LoanPaymentSchecule;

public interface ILoanPaymentService {

	LoanPaymentSchecule loanPayment(LoanPaymentSchecule payment) throws Exception;
}
