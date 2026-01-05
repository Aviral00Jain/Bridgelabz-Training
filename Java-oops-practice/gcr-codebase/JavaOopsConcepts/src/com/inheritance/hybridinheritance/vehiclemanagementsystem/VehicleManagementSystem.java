package com.inheritance.hybridinheritance.vehiclemanagementsystem;

public class VehicleManagementSystem {
    public static void main(String[] args) {

        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225);
        PetrolVehicle pv = new PetrolVehicle("Honda City", 190);

        System.out.println("---- Electric Vehicle ----");
        ev.displayDetails();
        ev.charge();

        System.out.println("\n---- Petrol Vehicle ----");
        pv.displayDetails();
        pv.refuel();
    }
}