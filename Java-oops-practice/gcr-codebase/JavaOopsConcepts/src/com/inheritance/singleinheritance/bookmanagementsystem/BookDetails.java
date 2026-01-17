package com.inheritance.singleinheritance.bookmanagementsystem;

public class BookDetails {
	
	public static void main(String[] args) {
		
		Book author = new Author("java programming", "2000", "James Gosling", "Canadian computer scientist renowned for creating the Java programming language at Sun Microsystems in 1991, designing its compiler and virtual machine for platform independence");
	
		author.displayInfo();
	
	}

}
