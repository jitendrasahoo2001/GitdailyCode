package com.java.assi;

import java.util.*;

public class Product {
	public static void main(String[] args) {
		List<Prod> prod = new ArrayList<>();
		
		Prod prod1 = new Prod(101, "Laptop", 12000, 5);
		Prod prod2 = new Prod(102, "Mobile", 2000, 6);
		
		prod.add(prod1);
		prod.add(prod2);
		
		System.out.println("Product Available");
		for(Prod produ:prod) {
			 System.out.println("Product ID: " + produ.getProductId());
	            System.out.println("Product Name: " + produ.getProductName());
	            System.out.println("Price: " + produ.getPrice());
	            System.out.println("Quantity: " + produ.getQuantity());
			
		}
	}

}
