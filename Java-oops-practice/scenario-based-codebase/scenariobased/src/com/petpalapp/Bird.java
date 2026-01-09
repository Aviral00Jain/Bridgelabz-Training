package com.petpalapp;


public class Bird extends Pet {

    public Bird(String name, int age) {
        super(name, "Bird", age);
    }

    public void feed() {
        decreaseHunger(10);
        increaseMood(10);
        System.out.println(name + " is pecking grains.");
    }

    public void play() {
        decreaseEnergy(10);
        increaseMood(20);
        System.out.println(name + " is flying...");
    }

    public void sleep() {
        increaseEnergy(20);
        System.out.println(name + " is resting...");
    }

    public void makeSound() {
        System.out.println("Sound - Chirp! Chirp!");
    }
}
