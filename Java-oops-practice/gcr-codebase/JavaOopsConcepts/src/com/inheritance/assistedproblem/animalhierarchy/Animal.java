package com.inheritance.assistedproblem.animalhierarchy;

public class Animal {
	
	String name;
	int age;
	
	
	// Constructor
	Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// method
	void makeSound() {
		System.out.println("Animal sound : ");
	}

}
