package com.constructor.levelone;

public class Person {
    private String name;
    private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display Method
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("-----------------------");
        
    }
}