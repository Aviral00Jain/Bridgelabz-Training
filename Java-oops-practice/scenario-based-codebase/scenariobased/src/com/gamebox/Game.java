package com.gamebox;

class Game implements IDownloadable {

    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    Game(String title, String genre, double rating) {
        this(title, genre, 0.0, rating);
    }

    Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public void applyDiscount(double percent) {
        price = price - (price * percent / 100);
    }

    
    public void download() {
        System.out.println(title + " downloaded successfully.");
    }

    
    public void playDemo() {
        System.out.println("Playing demo of " + title);
    }

    public double getPrice() {
        return price;
    }
}
