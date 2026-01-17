package com.constructor.levelone;

public class BookDriver {
    public static void main(String[] args) {

        // Using Default Constructor
        Book b1 = new Book();

        // Using Parameterized Constructor
        Book b2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", 499.99);

        System.out.println("Book 1 Details:");
        b1.display();

        System.out.println("Book 2 Details:");
        b2.display();
        
    }
}