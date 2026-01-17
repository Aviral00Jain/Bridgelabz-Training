package com.constructor.levelone;

public class LibraryBookDriver {
    public static void main(String[] args) {

        // Default Book
        LibraryBook b1 = new LibraryBook();

        // Parameterized Book
        LibraryBook b2 = new LibraryBook("Atomic Habits", "James Clear", 699.0, true);

        System.out.println("Book 1 Details:");
        b1.display();

        System.out.println("Book 2 Details:");
        b2.display();

        System.out.println("Borrowing Book 2...");
        b2.borrow();

        System.out.println("Trying to borrow Book 2 again...");
        b2.borrow();
        
    }
}