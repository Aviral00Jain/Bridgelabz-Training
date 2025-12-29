package com.constructor.levelone;

public class PersonDriver {
    public static void main(String[] args) {

        // Creating Original Person
        Person p1 = new Person("John Doe", 25);

        // Creating Copy using Copy Constructor
        Person p2 = new Person(p1);

        System.out.println("Original Person:");
        p1.display();

        System.out.println("Cloned Person:");
        p2.display();
        
    }
}