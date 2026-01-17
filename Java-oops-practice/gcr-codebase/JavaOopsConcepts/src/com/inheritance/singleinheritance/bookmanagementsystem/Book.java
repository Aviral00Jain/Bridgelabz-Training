package com.inheritance.singleinheritance.bookmanagementsystem;

public class Book {
    //Attribute
	String title;
	String publicationYear;
	
	//Constructor
	Book(String title, String publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	
	//Method
	void displayInfo(){
		System.out.println("Book title :"+ title);
		System.out.println("Book publication year : "+ publicationYear);
		
	}
}
