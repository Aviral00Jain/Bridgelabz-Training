package com.birdsanctuary;


public class Duck extends Bird implements Swimmable{
	
	public Duck(String name, int id, String species) {
		super(name, id, species);
	}

	@Override
	public void eat() {
		System.out.println("duck eats seed.");
	}
	@Override 
	public void swim() {
		System.out.println("ducks swims.");
	}
}