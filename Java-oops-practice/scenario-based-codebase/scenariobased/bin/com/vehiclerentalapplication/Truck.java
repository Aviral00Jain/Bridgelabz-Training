package com.vehiclerentalapplication;

class Truck extends Vehicle {

    private double loadingCharge = 1000;

    public Truck(String vehicleNumber, double baseRate) {
        super(vehicleNumber, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadingCharge;
    }
}
