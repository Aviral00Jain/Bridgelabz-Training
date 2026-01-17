package com.inheritance.assistedproblem.animalhierarchy;

public class AnimalTest {
	
	public static void main(String[] args) {
		
		Animal a1 = new Dog("Ronnie", 5);
		Animal a2 = new Cat("merry", 3);
		Animal a3 = new Bird("chichi" , 1);
		
		
		// Calling method
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
	}

}
