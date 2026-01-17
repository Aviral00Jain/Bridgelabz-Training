package com.inheritance.singleinheritance.bookmanagementsystem;

public class Author extends Book {
	
	//Attribute
	String name;
	String bio;
	
	//Constructor
	Author(String title, String publicationYear, String name, String bio ){
		super(title, publicationYear );
		this.name = name;
		this.bio = bio;
	}
	
	//Method over-ridding
	void displayInfo() {
		System.out.println("Book title :"+ title);
		System.out.println("Book publication year : "+ publicationYear);
		System.out.println("Author name :"+ this.name);
		System.out.println("Author bio : "+ this.bio);
	}

}
