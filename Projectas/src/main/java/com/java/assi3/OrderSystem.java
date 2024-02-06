package com.java.assi3;

import java.util.*;

public class OrderSystem implements OrderOperation {
//	private Map<String,Customer> customerMap;
	
	
	Map<String, Customer> customerMap = new HashMap<>();

	public OrderSystem() {
		super();
		this.customerMap = customerMap;
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerMap.put(customer.getCustomerId(), customer);
	}

	@Override
	public double totalOrderValue(Customer customer, Map<String, Product> productMap) {
		// TODO Auto-generated method stub
		 double totalOrderValue = 0.0;
		 
		 for(Map.Entry<String, Integer> entry :customer.getOrders().entrySet()) {
			 String ProductId=entry.getKey();
			 
			 int quantity=entry.getValue();
			 
			 Product product = productMap.get(ProductId);
			 if (product != null) {
	                totalOrderValue += product.getPrice() * quantity;
	            }
		 }
		return totalOrderValue;
	}
	public Map<String,Customer> getcustomerMap(){
		return new HashMap<>(customerMap);
	}
	

}
