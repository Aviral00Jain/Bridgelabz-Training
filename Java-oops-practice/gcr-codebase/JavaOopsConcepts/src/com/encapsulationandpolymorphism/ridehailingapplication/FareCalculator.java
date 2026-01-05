package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.List;

class FareCalculator {

    public static void calculateFares(List<Vehicle> vehicles, double distance) {

        for (Vehicle v : vehicles) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Fare: " + fare);
            System.out.println("---------------------------");
        }
    }
}