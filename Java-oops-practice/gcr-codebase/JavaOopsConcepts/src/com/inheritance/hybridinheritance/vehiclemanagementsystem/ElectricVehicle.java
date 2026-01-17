package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println("Charging the electric vehicle.");
    }
}