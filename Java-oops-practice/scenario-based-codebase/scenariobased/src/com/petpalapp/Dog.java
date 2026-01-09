package com.petpalapp;


public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Dog", age);
    }

    public void feed() {
        decreaseHunger(20);
        increaseMood(10);
        System.out.println(name + " enjoyed the food!");
    }

    public void play() {
        decreaseEnergy(15);
        increaseMood(20);
        increaseHunger(10);
        System.out.println(name + " is playing...");
    }

    public void sleep() {
        increaseEnergy(25);
        System.out.println(name + " is sleeping...");
    }

    public void makeSound() {
        System.out.println("Sound - Woof! Woof!");
    }
}

