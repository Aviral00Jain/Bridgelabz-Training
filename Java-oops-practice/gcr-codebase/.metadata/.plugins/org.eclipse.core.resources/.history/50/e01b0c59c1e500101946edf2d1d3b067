package com.objectmodeling;

import java.util.ArrayList;

class Book{
	
	//instance variable
	protected String title;
	protected String author;
	
	//parameterized constructor to initialize the object
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
	
	//method to display book details
	void displayBook() {
		System.out.println("Title: "+title+", Author: "+author);
	}
}

class Library{
	//instance variable to store books
	ArrayList<Book> books=new ArrayList<Book>();
	
	//method to add book
	void addBook(Book book) {
		books.add(book);
	}
	
	//method to display all books in a library
	void displayBooks() {
		for(Book book:books) {
			book.displayBook();
		}
	}
}

public class LibraryAndBooks {
	public static void main(String[] args) {
		
		//creating book object(independent object)
		Book book1=new Book("Java Basics","VishalYadav");
		Book book2=new Book("Data Structures","Anupam Shukla");
		Book book3=new Book("Japanese","Anuj Dwivedi");
		
		//create library objects
		Library cityLibrary=new Library();
		Library collegeLibrary=new Library();
		
		//add books to libraries
		cityLibrary.addBook(book1);
		cityLibrary.addBook(book2);
		
		collegeLibrary.addBook(book2);
		collegeLibrary.addBook(book3);
		
		//display book in city library
		System.out.println("\tCity Library Books\t");
		cityLibrary.displayBooks();
		
		System.out.println();
		
		//display books in college library
		System.out.println("\tCollege Library Books\t");
		collegeLibrary.displayBooks();
	}
}