package com.java.assi3;

import java.util.*;

public class Customer {
	
	private String customerId;
	
    private Map<String, Integer> orders;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Map<String, Integer> getOrders() {
		return orders;
	}

	public void setOrders(Map<String, Integer> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", orders=" + orders + "]";
	}

//	public Customer(String customerId, Map<String, Integer> orders) {
//		super();
//		this.customerId = customerId;
//		this.orders = orders;
//	}
	 public Customer() {
	        this.orders = new HashMap<>(); // Initialize orders map
	    }
	 public Customer(String customerId, Map<String, Integer> orders) {
	        this.customerId = customerId;
	        this.orders = new HashMap<>();
	        if (orders != null) {
	            this.orders.putAll(orders);
	        }
	    }

//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
    
    
    

}
