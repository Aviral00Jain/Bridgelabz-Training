package com.inheritance.hybridinheritance.restaurantmanagementsystem;

class Person {
    protected String name;
    protected int id;

    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}