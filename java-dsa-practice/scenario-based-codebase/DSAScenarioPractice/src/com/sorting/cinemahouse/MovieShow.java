package com.sorting.cinemahouse;

class MovieShow {
    String movieName;
    int showTime; 

    public MovieShow(String movieName, int showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }

    
    public String toString() {
        return movieName + " - " + showTime;
    }
}