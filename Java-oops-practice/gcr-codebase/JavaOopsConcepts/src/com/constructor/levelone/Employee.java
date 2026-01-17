package com.constructor.levelone;

public class Employee {
    public int employeeID;         // Public
    protected String department;   // Protected
    private double salary;         // Private

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID : " + employeeID);
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + salary);
        System.out.println("--------------------------------");
        
    }
}