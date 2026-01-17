package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class Vehicle {
    protected int maxSpeed;
    protected String model;

    // Constructor
    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}