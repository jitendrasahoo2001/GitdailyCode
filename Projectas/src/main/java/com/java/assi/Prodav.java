package com.java.assi;

public class Prodav {
	private String productName;
    private double price;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Prodav(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Prodav [productName=" + productName + ", price=" + price + "]";
	}
	public Prodav() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
