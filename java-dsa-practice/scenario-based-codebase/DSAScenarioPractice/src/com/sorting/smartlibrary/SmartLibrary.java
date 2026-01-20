package com.sorting.smartlibrary;

import java.util.ArrayList;

class SmartLibrary {

    private ArrayList<Book> borrowedBooks = new ArrayList<>();

    public void issueBook(Book newBook) {

        int i = borrowedBooks.size() - 1;

        while (i >= 0 && borrowedBooks.get(i).title
               .compareToIgnoreCase(newBook.title) > 0) {
            i--;
        }

        borrowedBooks.add(i + 1, newBook);
    }

    public void displayBorrowedBooks() {
        for (Book b : borrowedBooks) {
            System.out.println(b);
        }
    }
}