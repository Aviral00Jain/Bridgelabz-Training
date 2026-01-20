package com.sorting.artexpo;

public class Main {
    public static void main(String[] args) {

        ArtExpo expo = new ArtExpo();

        expo.registerArtist(new Artist("Riya", 1705402000L));
        expo.registerArtist(new Artist("Aman", 1705401000L));
        expo.registerArtist(new Artist("Kunal", 1705403000L));
        expo.registerArtist(new Artist("Neha", 1705402500L));

        System.out.println("Artist List :");
        expo.displayArtists();
    }
}