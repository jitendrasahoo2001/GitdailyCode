package com.java.assi6;

public class SingletonImpl implements Singleton {
	
	private static SingletonImpl instance;
	
	private SingletonImpl() {}
	
	 public static SingletonImpl getInstance() {
	        if (instance == null) {
	            instance = new SingletonImpl();
	        }
	        return instance;
	    }
	 public void showMessage() {
	        System.out.println("Hello");
	    }

}
