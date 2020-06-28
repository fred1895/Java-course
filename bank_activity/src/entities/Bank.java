package entities;

public class Bank {
	//Objects
	private final int NUMBER_ACCOUNT;
	private String name;
	private double balance;
	
	//Constructors
	public Bank(final int NUMBER_ACCOUNT, String name) {
		this.NUMBER_ACCOUNT = NUMBER_ACCOUNT;
		this.name = name;
	}

	public Bank(final int NUMBER_ACCOUNT, String name, double initialDeposit) {
		this.NUMBER_ACCOUNT = NUMBER_ACCOUNT;
		this.name = name;
		deposit(initialDeposit);
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNUMBER_ACCOUNT() {
		return NUMBER_ACCOUNT;
	}
	
	public double getBalance() {
		return balance;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}
	
	public void withdraw(double deposit) {
		this.balance -= deposit + 5;
	}

	//Balance message
	public String toString() {
		//return "Account " + NUMBER_ACCOUNT + "| " + "Holder: " + name + ", " + "$" + getBalance();
		return String.format("Account %d  ||  Holder: %s, Balance $%.2f", NUMBER_ACCOUNT, name, getBalance());
	}
}