package model.entities;

import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment> installs;

	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Contract(Integer number, Date date, Double totalValue, List<Installment> installs) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installs = installs;
	}

	public Contract() {
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstalls() {
		return installs;
	}
	
	public void addInstallment(Installment installment) {
		installs.add(installment);
	}

	public void removeInstallment(Installment installment) {
		installs.remove(installment);
	}
	
}
