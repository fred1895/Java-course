package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		System.out.println("****** METHOD 1 START ******");
		method2();
		System.out.println("****** METHOD 1 END ******");
	}
	
	public static void method2() {
		System.out.println("****** METHOD 2 START ******");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.print(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		
		System.out.println("End of program");
		System.out.println("****** METHOD 2 END ******");
		sc.close();
	}

}
