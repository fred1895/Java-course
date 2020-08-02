package model.services;

public class PaypalService implements OnlinePaymentService {
	private static final double PAYMENT_FEE = 0.02;
	private static final double MONTHLY_PAYMENT = 0.01;

	@Override
	public Double paymentFee(Double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return months * amount * MONTHLY_PAYMENT;
	}
	
}
