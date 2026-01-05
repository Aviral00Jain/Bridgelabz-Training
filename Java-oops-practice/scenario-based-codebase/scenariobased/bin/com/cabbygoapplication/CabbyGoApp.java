package com.cabbygoapplication;

public class CabbyGoApp {

    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("MP04AB1234"); // Polymorphism
        Driver driver = new Driver("Rohit", "DL123456", 4.8);

        IRideService rideService = new RideService();
        rideService.bookRide(vehicle, driver, 12);
        rideService.endRide();
    }
}