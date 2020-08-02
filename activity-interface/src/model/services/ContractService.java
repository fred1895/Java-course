package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService payment;
	
	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService payment) {
		this.payment = payment;
	}
	
	public void processContract(Contract contract, int months) {
		double basicQuota = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double updatedQuota = basicQuota + payment.interest(basicQuota, i);
			double fullQuota = updatedQuota + payment.paymentFee(updatedQuota);
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstalls().add(new Installment(dueDate, fullQuota));
		}
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}

}
