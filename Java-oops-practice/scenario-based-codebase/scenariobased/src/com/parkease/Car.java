package com.parkease;

class Car extends Vehicle implements IPayable {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50); // base rate per hour
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 2;
        double penalty = 0;

        if (hours > allowedHours) {
            penalty = (hours - allowedHours) * 20;
        }

        return (baseRate * hours) + penalty;
    }
}
