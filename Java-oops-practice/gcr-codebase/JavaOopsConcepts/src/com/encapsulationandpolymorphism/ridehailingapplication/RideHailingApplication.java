package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApplication {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Car car = new Car("CAR101", "Rahul", 15);
        Bike bike = new Bike("BIKE202", "Amit", 8);
        Auto auto = new Auto("AUTO303", "Suresh", 12);

        car.updateLocation("MG Road");
        bike.updateLocation("City Center");
        auto.updateLocation("Railway Station");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        FareCalculator.calculateFares(vehicles, 10);
    }
}