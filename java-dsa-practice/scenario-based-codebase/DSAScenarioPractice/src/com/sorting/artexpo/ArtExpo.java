package com.sorting.artexpo;

import java.util.ArrayList;

class ArtExpo {

    private ArrayList<Artist> artists = new ArrayList<>();

    public void registerArtist(Artist newArtist) {

        int i = artists.size() - 1;

        while (i >= 0 && artists.get(i).registrationTime > newArtist.registrationTime) {
            i--;
        }

        artists.add(i + 1, newArtist);
    }

    public void displayArtists() {
        for (Artist a : artists) {
            System.out.println(a);
        }
    }
}