package com.sorting.fleetmanager;

class Vehicle {
    String vehicleId;
    int mileage;

    public Vehicle(String vehicleId, int mileage) {
        this.vehicleId = vehicleId;
        this.mileage = mileage;
    }

    
    public String toString() {
        return vehicleId + " : " + mileage + " km";
    }
}