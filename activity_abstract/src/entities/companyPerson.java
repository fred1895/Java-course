package entities;

public class companyPerson extends Person {
	private Integer numberOfEmployees;
	
	public companyPerson() {
		
	}

	public companyPerson(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public double totalTax() {
		double total = 0.0;
		if (numberOfEmployees > 10) {
			total = super.anualIncome * 14.0/100;
		} else {
			total = super.anualIncome * 16.0/100;
		}
		
		return total;
	}
}
