package com.petpalapp;


import java.util.Scanner;

public class PetPalApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to PetPal 🐾");
        System.out.print("Choose pet type (Dog / Cat / Bird): ");
        String petType = sc.nextLine();

        System.out.print("Enter pet name: ");
        String name = sc.nextLine();

        System.out.print("Enter pet age: ");
        int age = sc.nextInt();

        Pet pet;

        if (petType.equalsIgnoreCase("Dog")) {
            pet = new Dog(name, age);
        } else if (petType.equalsIgnoreCase("Cat")) {
            pet = new Cat(name, age);
        } else {
            pet = new Bird(name, age);
        }

        pet.makeSound();
        pet.showStatus();

        System.out.println("\nChoose action: \n1-Feed  \n2-Play  \n3-Sleep");
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> pet.feed();
            case 2 -> pet.play();
            case 3 -> pet.sleep();
            default -> System.out.println("Invalid choice");
        }

        System.out.println("\nUpdated Status:");
        pet.showStatus();
        System.out.println("Thank you for using PetPal App");

        sc.close();
    }
}