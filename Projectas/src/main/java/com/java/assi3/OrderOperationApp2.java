package com.java.assi3;
import java.util.HashMap;
import java.util.Map;

public class OrderOperationApp2 {
	

	    public static void main(String[] args) {
	        OrderOperation orderSystem = new OrderSystem();

	        Product product1 = new Product("P001", 20.0);
	        Product product2 = new Product("P002", 15.0);

	        Customer customer1 = new Customer();
	        customer1.getOrders().put("P001",3);
	        customer1.getOrders().put("P002",2);

	        Customer customer2 = new Customer();
	        customer2.getOrders().put("P001", 1);
	        customer2.getOrders().put("P002", 4);

	        Map<String, Product> productMap = getProductMap(product1, product2);

	        orderSystem.addCustomer(customer1);
	        orderSystem.addCustomer(customer2);

	        calculateAndDisplayTotalOrderValue(orderSystem, productMap);
	    }

	    private static Map<String, Product> getProductMap(Product... products) {
	        Map<String, Product> productMap = new HashMap<>();
	        for (Product product : products) {
	            productMap.put(product.getProductId(), product);
	        }
	        return productMap;
	    }

	    private static void calculateAndDisplayTotalOrderValue(OrderOperation orderSystem, Map<String, Product> productMap) {
	        Map<String, Customer> customerMap = ((OrderSystem) orderSystem).getcustomerMap();

	        for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
	            String customerId = entry.getKey();
	            Customer customer = entry.getValue();

	            double totalOrderValue = orderSystem.totalOrderValue(customer, productMap);

	            System.out.println("Customer ID: " + customerId);
	            System.out.println("Total Order Value: $" + totalOrderValue);
	            System.out.println("-----------------------------");
	        }
	    }
	}



