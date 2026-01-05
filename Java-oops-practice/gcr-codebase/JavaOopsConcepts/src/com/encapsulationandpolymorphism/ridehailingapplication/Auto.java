package com.encapsulationandpolymorphism.ridehailingapplication;

public class Auto extends Vehicle implements GPS {

    public Auto(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm + 20; // small base charge
    }

    @Override
    public String getCurrentLocation() {
        return getCurrentLocationInternal();
    }

    @Override
    public void updateLocation(String newLocation) {
        setCurrentLocation(newLocation);
    }
}