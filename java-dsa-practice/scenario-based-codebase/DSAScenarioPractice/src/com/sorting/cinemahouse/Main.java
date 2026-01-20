package com.sorting.cinemahouse;

public class Main {
    public static void main(String[] args) {

        MovieShow[] shows = {
            new MovieShow("Avengers", 1900),
            new MovieShow("Inception", 1430),
            new MovieShow("Titanic", 2130),
            new MovieShow("Interstellar", 1630)
        };

        BubbleSort.bubbleSort(shows);

        System.out.println(" Daily Movie Show Schedule:");
        for (MovieShow show : shows) {
            System.out.println(show);
        }
    }
}