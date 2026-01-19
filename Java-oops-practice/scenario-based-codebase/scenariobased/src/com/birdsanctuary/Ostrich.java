package com.birdsanctuary;


public class Ostrich extends Bird {
	public Ostrich(String name, int id, String species) {
		super(name, id, species);
	}
	@Override
	protected void eat() {
		System.out.println("Ostrich eats plants and seeds.");
	}
}