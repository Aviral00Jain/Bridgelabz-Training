
package com.homenest;
public class HomeNestSystem {

    public static void main(String[] args) {

        Device[] devices = {
            new Light("L1"),
            new Camera("C1"),
            new Thermostat("T1"),
            new Lock("K1")
        };

        for (Device d : devices) {
            d.turnOn();
            d.reset();     // Polymorphism
            System.out.println("Monthly Energy: " +
                    d.calculateMonthlyEnergy(6) + " kWh");
            d.turnOff();
            System.out.println("-------------------");
        }
    }
}