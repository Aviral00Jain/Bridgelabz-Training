package com.inheritance.assistedproblem.employeemanagementsytem;

public class Manager extends Employee{
	
	// Attributes
    String name;
    int id;
    double salary;
    int teamSize;
    
    // constructor
    Manager(String name, int id, double salary, int teamSize){
    	super(name, id, salary);
    	this.teamSize = teamSize;
    }
    
    // method over-ridding
    void displayDetails() {
    	System.out.println("Manager name : "+ super.name);
		System.out.println("Manager ID : " + super.id);
		System.out.println("Manager salary : "+ super.salary);
		System.out.println("Manager team size : "+ this.teamSize );
    }
    
}
