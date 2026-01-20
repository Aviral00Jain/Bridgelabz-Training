package com.bookshelf;

public class LibraryApp {
    public static void main(String[] args) {

        BookShlef shelf = new BookShlef();

        shelf.addBook(new Book("Clean Code", "Robert Martin", "Programming"));
        shelf.addBook(new Book("Effective Java", "Joshua Bloch", "Programming"));
        shelf.addBook(new Book("1984", "George Orwell", "Fiction"));

        shelf.displayCatalog();

        shelf.borrowBook("Programming", "Clean Code");

        shelf.displayCatalog();
    }
}