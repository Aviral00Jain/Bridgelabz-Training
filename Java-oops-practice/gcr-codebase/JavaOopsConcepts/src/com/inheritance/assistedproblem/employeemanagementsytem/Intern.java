package com.inheritance.assistedproblem.employeemanagementsytem;

public class Intern extends Employee{
	
	//Attribute
	String timePeriod;
	
	//constructor
	Intern(String name, int id, double salary, String timePeriod){
		super(name, id, salary);
		this.timePeriod = timePeriod;
	}
	
	// method over-ridding
	void displayDetails() {
		System.out.println("Intern name : "+ super.name);
		System.out.println("Intern ID : " + super.id);
		System.out.println("Intern salary : "+ super.salary);
		System.out.println("Intern team size : "+ this.timePeriod );
	}

}
