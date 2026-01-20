package com.sorting.robowarehouse;

public class Main {
    public static void main(String[] args) {

        RoboWarehouse robot = new RoboWarehouse();

        robot.addPackage(new PackageItem(40));
        robot.addPackage(new PackageItem(10));
        robot.addPackage(new PackageItem(30));
        robot.addPackage(new PackageItem(20));

        System.out.println(" Shelf Order Ascending ");
        robot.displayShelf();
    }
}