package com.artify;

public class ArtifyApp {
    public static void main(String[] args) {

        User user = new User("Aaditya", 5000);

        Artwork art1 = new DigitalArt("Neon City", "Alex", 1200, "Personal Use");
        Artwork art2 = new PrintArt("Vintage Bloom", "Emma", 800, "Commercial Use");

        art1.purchase(user);
        art1.license();

        art2.purchase(user);
        art2.license();

        System.out.println("Remaining Balance: " + user.getWalletBalance());
    }
}