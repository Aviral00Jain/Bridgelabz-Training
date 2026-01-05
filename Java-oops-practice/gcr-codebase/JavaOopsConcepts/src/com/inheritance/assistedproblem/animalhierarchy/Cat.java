package com.inheritance.assistedproblem.animalhierarchy;

public class Cat extends Animal{

	String name;
	int age;
	
	//Constructor
	Cat(String name, int age){
		super(name, age);
	}
	
	// method
	void makeSound(){
		System.out.println(super.name + " : meow");
	}
}
