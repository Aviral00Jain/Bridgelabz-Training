package com.ambulanceroute;

public class HospitalApp {
    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.findAvailableUnit(); // Surgery

        route.removeUnit("Surgery");

        route.findAvailableUnit(); // No available unit
    }
}