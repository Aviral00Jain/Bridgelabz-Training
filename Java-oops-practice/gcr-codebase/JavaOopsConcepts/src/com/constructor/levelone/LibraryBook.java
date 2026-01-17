package com.constructor.levelone;

public class LibraryBook {
    private String title;
    private String author;
    private double price;
    private boolean available;

    // Default Constructor
    public LibraryBook() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        available = true;
    }

    // Parameterized Constructor
    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    // Borrow Method
    public void borrow() {
        if (available) {
            System.out.println(title + " has been borrowed successfully!");
            available = false;
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    // Display Method
    public void display() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : " + price);
        System.out.println("Available    : " + (available ? "Yes" : "No"));
        System.out.println("-----------------------------------");
        
    }
}