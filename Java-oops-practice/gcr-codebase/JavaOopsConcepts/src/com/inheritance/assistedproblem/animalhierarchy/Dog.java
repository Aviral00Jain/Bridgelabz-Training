package com.inheritance.assistedproblem.animalhierarchy;

public class Dog extends Animal {
    
	String name;
	int age;
	
	// Constructor
	Dog(String name, int age){
		super(name, age);
	}
	
	// method
	
	void makeSound(){
		System.out.println(super.name + " : Barks");
	}
}
