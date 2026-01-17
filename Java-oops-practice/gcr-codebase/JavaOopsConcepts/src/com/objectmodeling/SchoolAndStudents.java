package com.objectmodeling;

import java.util.ArrayList;

class Course {
	// instance variables
	String courseName;
	ArrayList<Student> students = new ArrayList<Student>();

	// constructor to initialize course
	Course(String courseName) {
		this.courseName = courseName;
	}

	// method to add student to course
	void addStudent(Student student) {
		students.add(student);
	}

	// method to display enrolled students
	void displayStudents() {
		System.out.println("Course: " + courseName);
		for (Student student : students) {
			System.out.println("Student Name: " + student.studentName);
		}
	}
}

class Student {
	// instance variables
	String studentName;
	ArrayList<Course> courses = new ArrayList<Course>();

	// constructor to initialize student
	Student(String studentName) {
		this.studentName = studentName;
	}

	// method to enroll in a course
	void enrollCourse(Course course) {
		courses.add(course);
		course.addStudent(this);
	}

	// method to display enrolled courses
	void viewCourses() {
		System.out.println("Student Name: " + studentName);
		for (Course course : courses) {
			System.out.println("Enrolled Course: " + course.courseName);
		}
	}
}

class School {
	// instance variables
	String schoolName;
	ArrayList<Student> students = new ArrayList<Student>();

	// constructor to initialize school
	School(String schoolName) {
		this.schoolName = schoolName;
	}

	// method to add student to school
	void addStudent(Student student) {
		students.add(student);
	}

	// method to display students in school
	void displayStudents() {
		System.out.println("School Name: " + schoolName);
		for (Student student : students) {
			System.out.println("Student: " + student.studentName);
		}
	}
}

public class SchoolAndStudents {
	public static void main(String[] args) {
		
		// create school
		School school = new School("Green Valley School");

		// create students
		Student student1 = new Student("Amit");
		Student student2 = new Student("Neha");

		// add students to school (Aggregation)
		school.addStudent(student1);
		school.addStudent(student2);

		// create courses
		Course math = new Course("Mathematics");
		Course science = new Course("Science");

		// students enrolling in courses (Association)
		student1.enrollCourse(math);
		student1.enrollCourse(science);

		student2.enrollCourse(science);

		System.out.println();

		// students viewing their courses
		student1.viewCourses();
		System.out.println();
		student2.viewCourses();

		System.out.println();

		// courses displaying enrolled students
		math.displayStudents();
		System.out.println();
		science.displayStudents();
	}
}