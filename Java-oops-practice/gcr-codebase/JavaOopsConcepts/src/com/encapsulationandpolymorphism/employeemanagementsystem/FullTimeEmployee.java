package com.encapsulationandpolymorphism.employeemanagementsystem;


class FullTimeEmployee extends Employee implements Department {

    // Attributes
    private String department;

    // Constructor
    public FullTimeEmployee(String name, double salary, int employeeId){
       super(employeeId, name, salary);
    }

    //abstract method
    public double calculateSalary(){
     return getBaseSalary();
    }

     @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

     @Override
     public String getDepartmentDetails(){
        return department;
    }
     
    
}
