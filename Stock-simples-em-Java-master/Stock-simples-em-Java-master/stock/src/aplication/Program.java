package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data :");
		System.out.println("Name : ");
		product.nome = sc.next();
		
		System.out.println("Price : ");
		product.price = sc.nextDouble();
		
		System.out.println("Quantity in stock : ");
		product.quantity = sc.nextInt();
		
		System.out.println(product);
		
		System.out.print("Enter the number of products to be added in stock :");
			int quantAdd = sc.nextInt();
			product.AddProducts(quantAdd);
		
	    System.out.println(product);	
		
	    System.out.print("Enter the number of products to be removed form stock :");
	    int quantRemov = sc.nextInt();
	    product.RemoveProducts(quantRemov);
	    
	    System.out.println(product);
		
		
		
		sc.close();
		
	}

}
