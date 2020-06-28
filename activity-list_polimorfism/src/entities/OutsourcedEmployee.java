package entities;

public class OutsourcedEmployee extends Employee {
	private Double additionalCharge;
	
	public OutsourcedEmployee() {
		
	}

	public OutsourcedEmployee(String name, Double valuePerHour, Integer hours, Double additionalCharge) {
		super(name, valuePerHour, hours);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
}
