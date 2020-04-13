package com.app.aforo255.loan.payment.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tb_cronograma_prestamos")
public class LoanPaymentSchecule implements Serializable {

	private static final long serialVersionUID = 4913093L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer id;
	@NotNull
	@Column(name="nro_prestamo")
	private int nroPrestamo;
	@NotNull
	private int cuota;
	@NotNull
	@Column(name="fecha_vencimiento")
	private String fechaVencimiento;
	@NotNull
	private int dias;
	@NotNull
	private double capital;
	@NotNull
	private double interes;
	@NotNull
	@Column(name="importe_cuota")
	private double importeCuota;
	@NotNull
	private boolean pagado;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNroPrestamo() {
		return nroPrestamo;
	}
	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}
	public int getCuota() {
		return cuota;
	}
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public double getImporteCuota() {
		return importeCuota;
	}
	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
}
