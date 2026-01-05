package com.vehiclerentalapplication;

class Car extends Vehicle {

    private double surcharge = 500; // fixed extra charge

    public Car(String vehicleNumber, double baseRate) {
        super(vehicleNumber, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + surcharge;
    }
}

