package com.birdsanctuary;


public abstract class Bird {
	
	//instance variable
	private String name;
	private int id;
	private String species;
	
	//constructor
	public Bird(String name, int id, String species) {
		this.name = name;
		this.id = id;
		this.species = species;
	}
	
	//getters instance variables
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getSpecies() {
		return species;
	}
	
	//protected abstract method 
	protected abstract void eat();
}
