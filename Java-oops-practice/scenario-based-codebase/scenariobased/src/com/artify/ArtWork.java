package com.artify;

abstract class Artwork implements IPurchasable {
    protected String title;
    protected String artist;
    protected double price;

    // Encapsulation: protected licensing
    protected String licenseType;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
    }

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, boolean hasPreview) {
        this(title, artist, price, licenseType);
        if (hasPreview) {
            System.out.println("Preview available for " + title);
        }
    }

    @Override
    public void purchase(User user) {
        user.deductBalance(price);
        System.out.println(user.getName() + " purchased " + title);
    }
}