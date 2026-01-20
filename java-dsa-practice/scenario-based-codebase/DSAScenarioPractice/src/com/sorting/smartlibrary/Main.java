package com.sorting.smartlibrary;

public class Main {
    public static void main(String[] args) {

        SmartLibrary library = new SmartLibrary();

        library.issueBook(new Book("Java Programming"));
        library.issueBook(new Book("Algorithms"));
        library.issueBook(new Book("Computer Networks"));
        library.issueBook(new Book("Data Structures"));

        System.out.println("Borrowed Books :");
        library.displayBorrowedBooks();
    }
}