package com.inheritance.assistedproblem.employeemanagementsytem;

public class Developer extends Employee {
	
	//Attributes
	String programmingLanguage;
	
	//Constructor
	Developer(String name, int id, double salary, String programmingLanguage){
		super(name, id, salary);
		this.programmingLanguage = programmingLanguage;
	}
	
	// method over-ridding
	void displayDetails() {
    	System.out.println("Developer name : "+ super.name);
		System.out.println("Developer ID : " + super.id);
		System.out.println("Developer salary : "+ super.salary);
		System.out.println("Developer team size : "+ this.programmingLanguage );
    }

}
