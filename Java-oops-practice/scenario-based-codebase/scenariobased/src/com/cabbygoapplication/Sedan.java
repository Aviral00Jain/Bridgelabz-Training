package com.cabbygoapplication;

public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    @Override
    public double getRatePerKm() {
        return 15;
    }
}