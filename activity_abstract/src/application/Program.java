package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Person;
import entities.companyPerson;
import entities.individualPerson;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of Tax Payers: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new individualPerson(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("How many employees does your company have? ");
				int numberOfEmployees = sc.nextInt();
				list.add(new companyPerson(name, anualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		for (Person person : list) {
			System.out.println(person.getName() + ": $" + String.format("%.2f", person.totalTax()));
		}
		
		double total = 0.0;
		
		for (Person person : list) {
			total += person.totalTax();
		}
		System.out.println();
		System.out.printf("Total taxes: %n %.2f", total);
		
		sc.close();
	}

}
