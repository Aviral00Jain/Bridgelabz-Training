package com.vehiclerentalapplication;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApplication {

    public static void main(String[] args) {

        Customer customer = new Customer("Amit", "C101");

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Bike("BIKE101", 300));
        vehicles.add(new Car("CAR202", 1500));
        vehicles.add(new Truck("TRK303", 3000));

        int days = 3;

        System.out.println("Customer: " + customer.getName());
        System.out.println("Rental Duration: " + days + " days\n");

        // Polymorphism in action
        for (Vehicle v : vehicles) {
            System.out.println("Vehicle No: " + v.getVehicleNumber());
            System.out.println("Total Rent: " + v.calculateRent(days));
            System.out.println("----------------------------");
        }
    }
}

