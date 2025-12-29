package com.constructor.levelone;
public class Circle {
    private double radius;

    // Default Constructor (calls parameterized constructor)
    public Circle() {
        this(1.0);   // default radius
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Optional: Display Method
    public void display() {
        System.out.println("Radius: " + radius);
        
    }
}