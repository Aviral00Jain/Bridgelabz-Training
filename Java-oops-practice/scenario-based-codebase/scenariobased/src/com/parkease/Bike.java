package com.parkease;

class Bike extends Vehicle implements IPayable {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    @Override
    public double calculateCharges(int hours) {
        return baseRate * hours; // no penalty
    }
}
