package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12AB1234", 2000, "CAR123"));
        vehicles.add(new Bike("MH14XY5678", 800, "BIKE456"));
        vehicles.add(new Truck("MH20TR9999", 4000, "TRUCK789"));

        int days = 3;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle No: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());

            double rentalCost = vehicle.calculateRentalCost(days);
            System.out.println("Rental Cost (" + days + " days): " + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("---------------------------");
        }
    }
}
