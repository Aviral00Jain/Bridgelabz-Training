package com.objectmodeling;

import java.util.ArrayList;

class Faculty {
	// instance variables
	int facultyId;
	String facultyName;

	// constructor to initialize faculty details
	Faculty(int facultyId, String facultyName) {
		this.facultyId = facultyId;
		this.facultyName = facultyName;
	}

	// method to display faculty details
	void displayFaculty() {
		System.out.println("Faculty ID: " + facultyId + ", Name: " + facultyName);
	}
}

class Department2 {
	// instance variable
	String departmentName;

	// constructor to initialize department
	Department2(String departmentName) {
		this.departmentName = departmentName;
	}

	// method to display department details
	void displayDepartment() {
		System.out.println("Department: " + departmentName);
	}
}

class University {
	// instance variables
	String universityName;
	ArrayList<Department2> departments = new ArrayList<Department2>(); // composition
	ArrayList<Faculty> faculties = new ArrayList<Faculty>(); // aggregation

	// constructor to initialize university
	University(String universityName) {
		this.universityName = universityName;
	}

	// method to add department (composition)
	void addDepartment(String departmentName) {
		departments.add(new Department2(departmentName));
	}

	// method to add faculty (aggregation)
	void addFaculty(Faculty faculty) {
		faculties.add(faculty);
	}

	// method to display university details
	void displayUniversityDetails() {
		System.out.println("University Name: " + universityName);

		System.out.println("Departments:");
		for (Department2 dept : departments) {
			dept.displayDepartment();
		}

		System.out.println("Faculties:");
		for (Faculty faculty : faculties) {
			faculty.displayFaculty();
		}
	}

	// method to delete university (composition effect)
	void deleteUniversity() {
		departments.clear(); // departments destroyed
		System.out.println("University deleted. All departments are removed.");
	}
}

public class UniversityAndFaculty {
	public static void main(String[] args) {

		// create faculty members (independent objects)
		Faculty faculty1 = new Faculty(101, "Dr. Sharma");
		Faculty faculty2 = new Faculty(102, "Dr. Mehta");

		// create university
		University university = new University("National University");

		// add departments (composition)
		university.addDepartment("Computer Science");
		university.addDepartment("Mechanical Engineering");

		// add faculty members (aggregation)
		university.addFaculty(faculty1);
		university.addFaculty(faculty2);

		// display university details
		university.displayUniversityDetails();

		System.out.println();

		// delete university
		university.deleteUniversity();

		System.out.println();

		// faculty still exists independently
		System.out.println("Faculty still exists independently:");
		faculty1.displayFaculty();
	}
}