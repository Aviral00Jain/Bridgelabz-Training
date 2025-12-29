package com.constructor.levelone;


public class Books {
    public String ISBN;        // Public
    protected String title;    // Protected
    private String author;     // Private

    public Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter for private author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for private author
    public String getAuthor() {
        return author;
    }

    public void displayBookDetails() {
        System.out.println("ISBN   : " + ISBN);
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("--------------------------------");
    }
}