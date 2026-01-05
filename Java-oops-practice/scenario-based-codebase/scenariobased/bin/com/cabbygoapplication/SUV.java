package com.cabbygoapplication;

public class SUV extends Vehicle {

    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV");
    }

    @Override
    public double getRatePerKm() {
        return 20;
    }
}