package com.sorting.smartshelf;

public class BookMain {
	
	public static void main(String[] args) {
		
		 BookArrangement smart = new BookArrangement();
		 
		 smart.addBook(new Book("Harray potter"));
		 smart.addBook(new Book("Java programming"));
		 smart.addBook(new Book("Python programming"));
		 smart.addBook(new Book("Atomic habit"));
		 
		 smart.displayShelf();
	}

}