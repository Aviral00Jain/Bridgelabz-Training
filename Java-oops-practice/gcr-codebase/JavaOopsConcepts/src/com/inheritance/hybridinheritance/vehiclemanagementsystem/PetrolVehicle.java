package com.inheritance.hybridinheritance.vehiclemanagementsystem;

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle.");
    }
}
