package com.bookshelf;

import java.util.*;

public class BookShlef {

	private Map<String, LinkedList<Book>> catalog = new HashMap<>();

	private Set<Book> bookSet = new HashSet<>();

	public void addBook(Book book) {
		catalog.putIfAbsent(book.genre, new LinkedList<>());
		catalog.get(book.genre).add(book);

		bookSet.add(book);
		System.out.println("Book added : " + book);
	}

	public void borrowBook(String genre, String title) {

		LinkedList<Book> books = catalog.get(genre);

		 Iterator<Book> iterator = books.iterator();
	        while (iterator.hasNext()) {
	            Book book = iterator.next();
	            if (book.title.equals(title)) {
	                iterator.remove();   // Efficient removal
	                bookSet.remove(book);
	                System.out.println("Book borrowed: " + book);
	                return;
	            }
	        }
	        System.out.println("Book not found!");
	}
	
	  public void displayCatalog() {
	        for (String genre : catalog.keySet()) {
	            System.out.println("\nGenre: " + genre);
	            for (Book book : catalog.get(genre)) {
	                System.out.println("  " + book);
	            }
	        }
	    }	
}