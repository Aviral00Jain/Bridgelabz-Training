package com.objectmodeling;

import java.util.ArrayList;

class Company {

	private String companyName;
	private ArrayList<Department> departmentList;

	public Company(String companyName) {
		this.companyName = companyName;
		departmentList = new ArrayList<>();
		System.out.println("Create Company: " + companyName);
	}

	// Add a new Department to the Company (Composition)
	public void addDepartment(String departmentName) {
		Department department = new Department(departmentName);
		departmentList.add(department);
	}

	// Display the complete Company structure
	public void displayCompanyStructure() {
		System.out.println("\nShow Company: " + companyName);
		for (Department department : departmentList) {
			department.displayEmployees();
		}
	}

	// Shut down the company and remove all associated objects
	public void shutdownCompany() {
		System.out.println("\nShut Down Company: " + companyName);
		departmentList.clear(); // Remove Departments + Employees (Composition)
		System.out.println("Delete all Departments and Employees (Composition Effect)");
	}

	// Department (Inner Class) 
	class Department {

		private String departmentName;
		private ArrayList<Employee> employeeList;

		Department(String departmentName) {
			this.departmentName = departmentName;
			employeeList = new ArrayList<>();
			System.out.println("  Create Department: " + departmentName);
		}

		// Add an Employee to the Department
		void addEmployee(String employeeName) {
			Employee employee = new Employee(employeeName);
			employeeList.add(employee);
		}

		// Display Employees of the Department
		void displayEmployees() {
			System.out.println("\n  Show Department: " + departmentName);
			if (employeeList.isEmpty()) {
				System.out.println("    No Employees Found");
				return;
			}
			for (Employee emp : employeeList) {
				System.out.println("    Show Employee: " + emp.employeeName);
			}
		}

		// Employee (Inner class)
		class Employee {

			String employeeName;

			Employee(String employeeName) {
				this.employeeName = employeeName;
				System.out.println("    Create Employee: " + employeeName);
			}
		}
	}
}

// Main method
public class CompanyAndDepartments {
	public static void main(String[] args) {

		// Create Company
		Company techCompany = new Company("Tech Solutions Pvt Ltd");

		// Add Departments
		techCompany.addDepartment("Information Technology");
		techCompany.addDepartment("Human Resources");

		// Create IT Department and Add Employees
		Company.Department itDept = techCompany.new Department("Software Development");
		itDept.addEmployee("Anupam");
		itDept.addEmployee("Anuj");

		// Create HR Department and Add Employees
		Company.Department hrDept = techCompany.new Department("Recruitment Team");
		hrDept.addEmployee("Vikash");

		// Display Full Structure
		techCompany.displayCompanyStructure();

		// Shut Down Company (Deletes Departments + Employees)
		techCompany.shutdownCompany();
	}
}