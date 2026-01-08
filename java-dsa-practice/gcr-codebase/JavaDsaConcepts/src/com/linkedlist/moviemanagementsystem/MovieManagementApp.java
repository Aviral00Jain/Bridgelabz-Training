package com.linkedlist.moviemanagementsystem;

public class MovieManagementApp {
    public static void main(String[] args) {

        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        movies.addAtBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtEnd("Avatar", "James Cameron", 2009, 7.8);

        movies.addAtPosition(2, "Titanic", "James Cameron", 1997, 7.9);

        System.out.println("\nMovies (Forward):");
        movies.displayForward();

        System.out.println("\nMovies (Reverse):");
        movies.displayReverse();

        System.out.println("\nSearch by Director:");
        movies.searchByDirector("Christopher Nolan");

        System.out.println("\nSearch by Rating >= 8:");
        movies.searchByRating(8);

        System.out.println("\nUpdate Rating:");
        movies.updateRating("Avatar", 8.2);

        System.out.println("\nAfter Update:");
        movies.displayForward();

        System.out.println("\nRemove Movie:");
        movies.removeByTitle("Titanic");

        System.out.println("\nFinal List:");
        movies.displayForward();
    }
}