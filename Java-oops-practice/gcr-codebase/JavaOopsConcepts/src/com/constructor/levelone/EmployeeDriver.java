package com.constructor.levelone;

public class EmployeeDriver {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Finance", 55000);
        System.out.println("Employee Details:");
        e1.displayEmployee();

        e1.updateSalary(65000);
        System.out.println("After Salary Update:");
        e1.displayEmployee();
    }
}