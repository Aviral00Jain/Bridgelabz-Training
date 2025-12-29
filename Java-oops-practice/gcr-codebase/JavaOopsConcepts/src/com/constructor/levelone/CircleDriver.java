package com.constructor.levelone;

public class CircleDriver {
    public static void main(String[] args) {

        // Using Default Constructor
        Circle c1 = new Circle();

        // Using Parameterized Constructor
        Circle c2 = new Circle(5.5);

        System.out.println("Circle 1:");
        c1.display();

        System.out.println("Circle 2:");
        c2.display();
        
    }
}