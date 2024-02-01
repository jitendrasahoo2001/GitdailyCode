package com.java.assi;

import java.util.*;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> bookList = new ArrayList<>();

        Book book1 = new Book("Let us c", "Ganesh Mirda", true);
        Book book2 = new Book("Explore Inf", "Infinite", false);

        bookList.add(book1);
        bookList.add(book2);

        System.out.println("Library Book List:");
        for (Book book : bookList) {
            System.out.println("Book Name: " + book.getTitle());
            System.out.println("Book Author: " + book.getAuthor());
            System.out.println("Available: " + book.isAvailable());
        }

	}

}
