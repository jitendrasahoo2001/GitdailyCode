package com.java.assi;

import java.util.*;

public class ShopingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Prodav> shopcart = new ArrayList<>();
		
        Prodav product1 = new Prodav("Laptop", 300000);
        Prodav product2 = new Prodav("Smartphone", 50000);

        shopcart.add(product1);
        shopcart.add(product2);
        System.out.println("Shopping Cart:");
        for (Prodav prod : shopcart) {
            System.out.println("Product: " + prod.getProductName());
            System.out.println("Price: " + prod.getPrice());
        }

	}

}
