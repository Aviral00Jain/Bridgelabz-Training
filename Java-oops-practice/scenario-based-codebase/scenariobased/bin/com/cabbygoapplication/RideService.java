package com.cabbygoapplication;

public class RideService implements IRideService {

    private double fare; // sensitive
    private static final double BASE_FARE = 50;

    @Override
    public void bookRide(Vehicle vehicle, Driver driver, double distance) {

        fare = BASE_FARE + (distance * vehicle.getRatePerKm());

        System.out.println("Ride booked!");
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Estimated Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended.");
        System.out.println("Final Fare: ₹" + fare);
    }

    public double getFare() {
        return fare;
    }
}