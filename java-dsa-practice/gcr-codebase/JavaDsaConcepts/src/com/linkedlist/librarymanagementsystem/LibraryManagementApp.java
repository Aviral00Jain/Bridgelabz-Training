package com.linkedlist.librarymanagementsystem;

public class LibraryManagementApp {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addAtEnd(101, "Java Basics", "James Gosling", "Programming", true);
        library.addAtEnd(102, "Clean Code", "Robert Martin", "Software", true);
        library.addAtBeginning(103, "DSA Made Easy", "Narasimha Karumanchi", "DSA", false);
        library.addAtPosition(2, 104, "Effective Java", "Joshua Bloch", "Programming", true);

        System.out.println("\nAll Books (Forward):");
        library.displayForward();

        System.out.println("\nAll Books (Reverse):");
        library.displayReverse();

        System.out.println("\nSearch by Author:");
        library.searchByAuthor("Joshua Bloch");

        System.out.println("\nUpdate Availability:");
        library.updateAvailability(103, true);

        System.out.println("\nAfter Update:");
        library.displayForward();

        System.out.println("\nRemove Book:");
        library.removeByBookId(102);

        System.out.println("\nFinal Library:");
        library.displayForward();

        System.out.println("\nTotal Books: " + library.countBooks());
    }
}