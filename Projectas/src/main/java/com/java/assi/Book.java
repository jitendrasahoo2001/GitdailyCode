package com.java.assi;

public class Book {
	private String title;
    private String author;
    private boolean available;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String title, String author, boolean available) {
		super();
		this.title = title;
		this.author = author;
		this.available = available;
	}
    
    

}
