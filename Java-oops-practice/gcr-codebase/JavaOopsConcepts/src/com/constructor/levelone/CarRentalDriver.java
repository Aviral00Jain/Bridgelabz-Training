package com.constructor.levelone;


public class CarRentalDriver {
    public static void main(String[] args) {

        // Default Rental
        CarRental r1 = new CarRental();

        // Parameterized Rental
        CarRental r2 = new CarRental("Aaditya Joshi", "SUV", 4);

        System.out.println("Default Rental:");
        r1.display();

        System.out.println("Customer Rental:");
        r2.display();
        
    }
}