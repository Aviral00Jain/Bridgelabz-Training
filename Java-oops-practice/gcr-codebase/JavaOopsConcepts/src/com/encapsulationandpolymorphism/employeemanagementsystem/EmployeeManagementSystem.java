package com.encapsulationandpolymorphism.employeemanagementsystem;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("Ayush", 990000,92221057);
        ((Department)e1).assignDepartment("IT");
        
        Employee e2 = new PartTimeEmployee(234598,"Denis",8, 800);
        ((Department)e2).assignDepartment("java");
        
        Employee[] employees = { e1, e2 };

        for (Employee emp : employees) {
            emp.displayDetails();

            Department dept = (Department) emp;
            System.out.println("Department: " + dept.getDepartmentDetails());

            System.out.println("----------------------");
        }
    }
}
