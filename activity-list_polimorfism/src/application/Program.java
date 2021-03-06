package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int numEmployee = sc.nextInt();
		
		for (int i = 0; i < numEmployee; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.println("Is this employee outsourced? (y/n) ");
			char anwser = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Enter the value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Enter the number of worked hours: ");
			int hours = sc.nextInt();
			
			if(anwser == 'y') {
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourcedEmployee(name, valuePerHour, hours, additionalCharge));
			} else {
				list.add(new Employee(name, valuePerHour, hours));
			}
		}
		
		System.out.println();
		System.out.println("Payment: ");
		for (Employee employee : list) {
			System.out.println("Employee: " + employee.getName() + " - $" + String.format("%.2f", employee.payment()));
		}
		sc.close();
	}

}
