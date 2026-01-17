package com.encapsulationandpolymorphism.employeemanagementsystem;

abstract class Employee {

    //Abstract attribute
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary){
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //Getters and Setters

    int getEmployeeId(){
       return employeeId;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }

    // Abstract method
    public abstract double calculateSalary();

    // concrete method
    public void displayDetails(){
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + calculateSalary());
    }

}
