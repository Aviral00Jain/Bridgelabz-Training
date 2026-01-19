package com.birdsanctuary;


public class Seagull extends Bird implements Flyable, Swimmable {

	public Seagull(String name, int id, String species) {
		super(name, id, species);
	}

	protected void eat() {
		System.out.println("seagull eats fish and scraps.");
	}
	
	public void fly() {
		System.out.println("seagull flies over the sea.");
	}

	public void swim() {
		System.out.println("Seagull swims briefly on water.");
	}
}
