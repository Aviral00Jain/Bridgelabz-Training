package com.petpalapp;

import java.util.Random;
public abstract class Pet implements IInteractable{
	protected String name;
	protected String type;
	protected int age;
	
	private int hunger;
	private int mood;
	private int energy;
	
	public Pet(String name, String type, int age) {
		Random rand = new Random();
		this.name = name;
		this.type = type;
		this.age = age;
		this.hunger = rand.nextInt(40) + 30;
		this.mood = rand.nextInt(40) + 30;
		this.energy = rand.nextInt(40) + 30;
	}
	
	// Protected methods to modify internal state
    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy + value);
    }

    protected void decreaseEnergy(int value) {
        energy = Math.max(0, energy - value);
    }

    protected void increaseMood(int value) {
        mood = Math.min(100, mood + value);
    }

    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger - value);
    }

    protected void increaseHunger(int value) {
        hunger = Math.min(100, hunger + value);
    }

    public void showStatus() {
        System.out.println("Hunger: " + hunger + ", Energy: " + energy);
        if(mood < 40) {
        	System.out.println("mood: Happy");
        }
        else if(mood == 40) {
        	System.out.println("mood: Normal");
        }
        else {
        	System.out.println("mood: Sad");
        }
    }

    // Polymorphism
    public abstract void makeSound();
}