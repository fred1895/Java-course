package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Bank bank;
		
		System.out.println("New account");
		
		//Input data
		System.out.print("New account number: ");
		int NUMBER_ACCOUNT = sc.nextInt(); 
		System.out.println();
		
		System.out.print("New account name: ");
		String name = sc.next();
		System.out.println();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char choice = sc.next().charAt(0);
		System.out.println();
		
		if (choice == 'n') {
			bank = new Bank(NUMBER_ACCOUNT, name);
			System.out.println(bank);
			
		} else {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			bank = new Bank(NUMBER_ACCOUNT, name, deposit);
			System.out.println(bank);
		}
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.deposit(deposit);
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		deposit = sc.nextDouble();
		bank.withdraw(deposit);
		System.out.println(bank);
		
		
		sc.close();
	}

}
