package com.objectandclass.level1;


public class HandBook {

	
	String bookTitle;
	String bookAuthor;
	double price;
	
	//creating constructor
	HandBook(String bookTitle, String bookAuthor, double price){
		this.bookTitle =bookTitle;
		this.bookAuthor =bookAuthor;
		this.price = price;
	}
	
	//method to display book details 
	public void displayBookDetails() {
		System.out.println("Title of the book : "+bookTitle);
		System.out.println("Author of the book : "+bookAuthor);
		System.out.println("price of the book : "+price);
	}
	
	public static void main(String[] args) {

		HandBook book1 = new HandBook("java ", "oracle ", 456);
		HandBook book2 = new HandBook("c++", "oracle", 567);
		book1.displayBookDetails();
		book2.displayBookDetails();
		
	}

}