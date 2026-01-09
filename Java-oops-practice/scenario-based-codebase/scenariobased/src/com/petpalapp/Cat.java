package com.petpalapp;


public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Cat", age);
    }

    public void feed() {
        decreaseHunger(15);
        increaseMood(15);
        System.out.println(name + " ate quietly.");
    }

    public void play() {
        decreaseEnergy(10);
        increaseMood(15);
        System.out.println(name + " is playing...");
    }

    public void sleep() {
        increaseEnergy(30);
        System.out.println(name + " is sleeping...");
    }

    public void makeSound() {
        System.out.println("Sound - Meow!");
    }
}