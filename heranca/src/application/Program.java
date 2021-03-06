package application;


import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Fred", 500.0);
		BusinessAccount bacc = new BusinessAccount(2001, "Camila", 500.0, 500.00);
		SavingsAccount sacc = new SavingsAccount(3001, "Flavia", 500.0, 0.5);
		
		//UPCASTING
		Account acc1 = bacc;
		Account acc2 = sacc;
		Account acc3 = new BusinessAccount(4001, "Ana", 30.0, 100.00);
		Account acc4 = new SavingsAccount(5001, "Joao", 100.0, 0.5);
		
		//DOWNCASTING
		BusinessAccount acc5 = (BusinessAccount) acc1;
		//BusinessAccount acc6 = (BusinessAccount) acc4;
		
		if(acc4 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount) acc4;
			acc6.loan(150.0);
			System.out.println("loan");
		}
		
		if (acc4 instanceof SavingsAccount) {
			SavingsAccount acc6 = (SavingsAccount) acc4;
			acc6.updateBalance();
			System.out.println("Update");
		}
		
		//@Override
		acc.withdraw(50);
		System.out.println(acc.getBalance());
		bacc.withdraw(50);
		System.out.println(bacc.getBalance());
		sacc.withdraw(50);
		System.out.println(sacc.getBalance());
		
	}

}
