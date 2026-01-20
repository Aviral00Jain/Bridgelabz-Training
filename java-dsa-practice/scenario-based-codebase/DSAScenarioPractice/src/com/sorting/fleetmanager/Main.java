package com.sorting.fleetmanager;

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Vehicle("101", 12000),
            new Vehicle("102", 18000),
            new Vehicle("103", 15000),
            new Vehicle("104", 9000),
            new Vehicle("105", 20000)
        };

        MergeSort.mergeSort(vehicles, 0, vehicles.length - 1);

        System.out.println(" Fleet Maintenance Schedule:");
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}