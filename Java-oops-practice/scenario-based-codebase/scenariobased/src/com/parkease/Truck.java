package com.parkease;

class Truck extends Vehicle implements IPayable {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 1;
        double penalty = 0;

        if (hours > allowedHours) {
            penalty = (hours - allowedHours) * 50;
        }

        return (baseRate * hours) + penalty;
    }
}
