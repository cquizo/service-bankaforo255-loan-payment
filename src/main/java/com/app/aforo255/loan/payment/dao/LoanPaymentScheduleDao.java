package com.app.aforo255.loan.payment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.app.aforo255.loan.payment.entity.LoanPaymentSchecule;

public interface LoanPaymentScheduleDao extends CrudRepository<LoanPaymentSchecule, Integer>{
	
	@Query("select o from LoanPaymentSchecule o where o.nroPrestamo = ?1 and o.cuota = ?2")
	List<LoanPaymentSchecule> getLoanPaymentSchedule(int nroPrestamo, int cuota);
}
