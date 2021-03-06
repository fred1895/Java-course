package entities;

public class individualPerson extends Person {
	private Double healthExpenditures;

	public individualPerson() {

	}

	public individualPerson(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	
	@Override
	public double totalTax() {
		double total = 0.0;
		if (super.getAnualIncome() <= 20000.0) {
			total = super.anualIncome * 15.0/100;
		} else {
			total = super.anualIncome * 25.0/100;
		}
		
		if (healthExpenditures > 0.0) {
			total -= healthExpenditures * 50.0/100;
		}
		
		return total;
	}
}
