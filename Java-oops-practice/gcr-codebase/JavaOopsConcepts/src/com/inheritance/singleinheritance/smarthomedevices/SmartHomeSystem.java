package com.inheritance.singleinheritance.smarthomedevices;

public class SmartHomeSystem {
    public static void main(String[] args) {

        Thermostat thermostat = new Thermostat("TH-101", "ON", 24);

        System.out.println("---- Thermostat Status ----");
        thermostat.displayStatus();
    }
}