package com.java.assi3;

import java.util.*;

public class OrderSystemApp {
	public static void main(String[] args) {
		OrderOperation orderSystem = new OrderSystem();
		
//		 List<Product> productList = readProductInfoFromFile("product_info.txt");
		 List<Product> productList = getSampleProductList();

	        Map<String, Product> productMap = getProductMap(productList);

	        List<Customer> customerList = getSampleCustomerList();

	        storeCustomerOrders(orderSystem, customerList, productMap);

	        displayTotalOrderValue(orderSystem, productMap);
	}

	private static List<Product> getSampleProductList() {
		// TODO Auto-generated method stub
		List<Product> productList = new ArrayList<>();
        productList.add(new Product("P001", 1200.00));
        productList.add(new Product("P002", 800.00));
        productList.add(new Product("P003", 50.00));
        productList.add(new Product("P004", 20.00));
        return productList;
	}

	private static void displayTotalOrderValue(OrderOperation orderSystem, Map<String, Product> productMap) {
		// TODO Auto-generated method stub
		 Map<String, Customer> customerMap = ((OrderSystem) orderSystem).getcustomerMap();

	        for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
	            String customerId = entry.getKey();
	            Customer customer = entry.getValue();

	            double totalOrderValue = orderSystem.totalOrderValue(customer, productMap);

	            System.out.println("Customer id: " + customerId);
	            System.out.println("Total Order Value: " + totalOrderValue);
	        }
	    }
		
	

	private static void storeCustomerOrders(OrderOperation orderSystem, List<Customer> customerList,
			Map<String, Product> productMap) {
		// TODO Auto-generated method stub
		for (Customer customer : customerList) {
            orderSystem.addCustomer(customer);
        }
		
	}

	private static List<Customer> getSampleCustomerList() {
		// TODO Auto-generated method stub
		List<Customer> customerList = new ArrayList<>();

        Map<String, Integer> order1 = new HashMap<>();
        order1.put("P001", 2);
        order1.put("P002", 1);

        Map<String, Integer> order2 = new HashMap<>();
        order2.put("P003", 3);
        order2.put("P004", 5);

        customerList.add(new Customer("C001", order1));
        customerList.add(new Customer("C002", order2));

        return customerList;
	}

	private static Map<String, Product> getProductMap(List<Product> productList) {
		// TODO Auto-generated method stub
		Map<String, Product> productMap = new HashMap<>();
        for (Product product : productList) {
            productMap.put(product.getProductId(), product);
        }
        return productMap;
	}

}
