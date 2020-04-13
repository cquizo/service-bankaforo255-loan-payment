package com.app.aforo255.loan.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.aforo255.loan.payment.dao.LoanPaymentScheduleDao;
import com.app.aforo255.loan.payment.entity.LoanPaymentSchecule;

@Service
public class LoanPaymentServiceImpl implements ILoanPaymentService{

	@Autowired
	private LoanPaymentScheduleDao loanPaymentScheduDao; 
	
	@Override
	@Transactional
	public LoanPaymentSchecule loanPayment(LoanPaymentSchecule payment) throws Exception {
		List<LoanPaymentSchecule> list = loanPaymentScheduDao.getLoanPaymentSchedule(payment.getNroPrestamo(), payment.getCuota());
		if (list == null || list.isEmpty()) {
			throw new Exception("Loan number "+ payment.getNroPrestamo() + " and fee number "+ payment.getCuota() + " was not found");
		}
		LoanPaymentSchecule loanToPay = list.get(0);
		if (loanToPay.isPagado()) {
			throw new Exception("Loan number "+ payment.getNroPrestamo() + " and fee number "+ payment.getCuota() + " is already payed");
		}
		loanToPay.setPagado(true);
		return loanPaymentScheduDao.save(loanToPay);
	}

}
