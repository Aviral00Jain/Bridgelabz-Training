package com.sorting.artexpo;

class Artist {
    String name;
    long registrationTime; 

    public Artist(String name, long registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    public String toString() {
        return name + " Time: " + registrationTime ;
    }
}