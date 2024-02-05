package com.java.assi3;

import java.util.Map;

public interface OrderOperation {
	
	void addCustomer(Customer customer);
	
	double totalOrderValue(Customer customer,Map<String,Product> productMap);

}
