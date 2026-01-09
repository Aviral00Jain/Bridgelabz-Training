package com.parkease;

public class ParkEaseApp {

    public static void main(String[] args) {

        ParkingSlot slot =
                new ParkingSlot("A1", "Mall Basement", "Car");

        Vehicle car = new Car("MP04AB1234");

        ParkingManager manager = new ParkingManager();
        manager.bookSlot(slot, car, 4);
    }
}
