package com.encapsulationandpolymorphism.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {

	 private int hoursWorked;
	    private double hourlyRate;
	    private String department;

	    public PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
	        super(id, name, 0);
	        this.hoursWorked = hoursWorked;
	        this.hourlyRate = hourlyRate;
	    }

    public double calculateSalary(){
     return hoursWorked * hourlyRate ;
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
