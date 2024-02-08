package com.java.assi6;

public class SingletonMain {
	 public static void main(String[] args) {
	        Singleton singleton = SingletonImpl.getInstance();

	        singleton.showMessage();

	        Data pojo = new Data("This is some data.");

	        System.out.println("Original data: " + pojo.getData());
	        pojo.setData("Modified data.");
	        System.out.println("Modified data: " + pojo.getData());
	    }

}
