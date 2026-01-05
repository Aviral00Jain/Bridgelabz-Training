package com.inheritance.assistedproblem.employeemanagementsytem;

public class Employee {
	
	//Attributes
	String name;
	int id;
	double salary;
	
	//Constructor
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//Method
	void displayDetails() {
		System.out.println("Employee name : "+ this.name);
		System.out.println("Employee ID : " + this.id);
		System.out.println("Employee salary : "+ this.salary);
	}
	
	
	

}
