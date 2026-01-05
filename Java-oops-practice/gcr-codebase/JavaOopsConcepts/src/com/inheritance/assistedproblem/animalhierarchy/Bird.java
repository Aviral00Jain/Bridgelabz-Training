package com.inheritance.assistedproblem.animalhierarchy;

public class Bird extends Animal{
	
	// Attributes
	String name;
	int age;
	
	// Constructor
	Bird(String name, int age){
		super(name, age);
	}
	
	// method
	void makeSound() {
		System.out.println(super.name+ " : chirp");
	}

}
