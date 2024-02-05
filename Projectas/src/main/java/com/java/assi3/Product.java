package com.java.assi3;

public class Product {
	private String productId;
	
    private double price;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", price=" + price + "]";
	}

	public Product(String productId, double price) {
		super();
		this.productId = productId;
		this.price = price;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
