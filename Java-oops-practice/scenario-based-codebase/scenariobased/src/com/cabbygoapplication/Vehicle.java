
package com.cabbygoapplication;
public abstract class Vehicle {

    protected String vehicleNumber;
    protected int capacity;
    protected String type;

    public Vehicle(String vehicleNumber, int capacity, String type) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
    }

    public abstract double getRatePerKm();

    public String getType() {
        return type;
    }
}