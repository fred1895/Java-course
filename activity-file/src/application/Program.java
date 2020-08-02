package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Product> products = new ArrayList<>();
		
		System.out.println("Enter the file path: ");
		String fileSourceStr = sc.nextLine();
		
		File sourceFile = new File(fileSourceStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean sucess = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileSourceStr))) {
			String itemCSV = br.readLine();
			while (itemCSV != null) {
				String [] itens = itemCSV.split(",");
				String name = itens[0];
				double price = Double.parseDouble(itens[1]);
				int quantity = Integer.parseInt(itens[2]);
				products.add(new Product(name, price, quantity));
				itemCSV = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
				for (Product product : products) {
					bw.write(product.getName() + "," + String.format("%.2f", product.total()));
					bw.newLine();
				}
			} catch (IOException e) {
				System.out.println("Error writing the file " + e.getMessage());
			}
		} catch (IOException e) {
			System.out.println("Error reading the file " + e.getMessage());
		}
		
		sc.close();
	}

}
