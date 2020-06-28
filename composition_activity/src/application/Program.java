package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre the client data:");
		System.out.print("Name: ");
		String clientName = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date: ");
		Date birthDate = sdf.parse(sc.next());
		
		System.out.println("Enter order data:");
		System.out.print("Enter order status: ");
		String orderStatus = sc.next();
		System.out.print("Enter how many item to this order? ");
		int numberOfItens = sc.nextInt();
		Date moment = new Date();
		
		Order order = new Order(moment, OrderStatus.valueOf(orderStatus), new Client(clientName, email, birthDate));
		
		for (int i = 1; i <= numberOfItens; i++) {
			System.out.println("Enter Item #" + i + " data: ");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
			order.addItem(orderItem);
		}
		System.out.println("--------------------------------");
		System.out.println(order);
		
		
		sc.close();
	}

}
