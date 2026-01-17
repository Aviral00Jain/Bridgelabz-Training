package com.vehiclerentalapplication;

abstract class Vehicle implements Rentable {

    // protected → accessible to subclasses
    protected String vehicleNumber;
    protected double baseRate;

    // encapsulated field
    private boolean available;

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
        this.available = true;
    }

    // Encapsulation via getters/setters
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}

