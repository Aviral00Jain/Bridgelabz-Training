package com.encapsulationandpolymorphism.librarymanagementsystem;

public abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    // Sensitive borrower data (encapsulated)
    private String borrowerName;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation – getters only
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    protected String getAuthor() {
        return author;
    }

    protected void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    protected String getBorrowerName() {
        return borrowerName;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}