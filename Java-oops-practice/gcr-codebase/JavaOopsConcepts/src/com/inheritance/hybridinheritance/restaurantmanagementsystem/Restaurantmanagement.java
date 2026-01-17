package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Restaurantmanagement{
    public static void main(String[] args) {

        Chef chef = new Chef("Ramesh", 101);
        Waiter waiter = new Waiter("Suresh", 201);

        System.out.println("---- Chef Details ----");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\n---- Waiter Details ----");
        waiter.displayInfo();
        waiter.performDuties();
    }
}