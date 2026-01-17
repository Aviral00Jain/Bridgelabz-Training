package com.vehiclerentalapplication;

class Bike extends Vehicle {

    public Bike(String vehicleNumber, double baseRate) {
        super(vehicleNumber, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; // simple calculation
    }
}

