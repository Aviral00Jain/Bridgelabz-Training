package com.birdsanctuary;



public class Penguin extends Bird implements Swimmable{

	public Penguin(String name, int id, String species) {
		super(name, id, species);
	}

	@Override
	public void eat() {
		System.out.println("penguin eats fish");
	}
	@Override
	public void swim() {
		System.out.println("penguin swims efficiently");
	}

}