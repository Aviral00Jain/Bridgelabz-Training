package com.defaultmethods.smartvehicle;

public class ElectricCar implements Vehicle {
    @Override
    public void displaySpeed() {
        System.out.println("Electric Car speed: 70 km/h");
    }

    // Override default method
    @Override
    public void displayBatteryStatus() {
        System.out.println("Battery remaining: 65%");
    }
}