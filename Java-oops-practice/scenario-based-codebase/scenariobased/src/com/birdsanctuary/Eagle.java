package com.birdsanctuary;


public class Eagle extends Bird implements Flyable{
	public Eagle(String name, int id, String species) {
		super(name, id, species);
	}
	@Override
	public void eat() {
		System.out.println("Eagle hunts prey.");
	}
	@Override 
	public void fly() {
		System.out.println("Eagle flies high.");
	}
}
