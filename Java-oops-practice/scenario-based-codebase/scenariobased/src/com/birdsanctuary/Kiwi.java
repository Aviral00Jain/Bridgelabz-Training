package com.birdsanctuary;


public class Kiwi extends Bird {
	public Kiwi(String name, int id, String species) {
		super(name, id, species);
	}
	@Override
	protected void eat() {
		System.out.println("Kiwi eats fruits.");
	}
}