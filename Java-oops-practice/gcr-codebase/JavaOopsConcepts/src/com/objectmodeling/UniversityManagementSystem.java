package com.objectmodeling;

import java.util.ArrayList;

//class to represent a Course
class Course1 {
	//instance variables
	int courseId;
	String courseName;
	Professor professor;

	//constructor to initialize course details
	Course1(int courseId, String courseName) {
		this.courseId = courseId;
		this.courseName = courseName;
	}

	//method to assign professor to course (communication)
	void assignProfessor(Professor professor) {
		this.professor = professor;
		System.out.println("Professor " + professor.professorName +
						   " assigned to course " + courseName);
	}

	//method to display course details
	void displayCourse() {
		System.out.println("Course ID: " + courseId + ", Name: " + courseName);
		if (professor != null) {
			System.out.println("Taught by: " + professor.professorName);
		}
	}
}

//class to represent a Student
class Student1 {
	//instance variables
	int studentId;
	String studentName;
	ArrayList<Course1> courses = new ArrayList<Course1>();

	//constructor to initialize student details
	Student1(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	//method to enroll in a course (communication)
	void enrollCourse(Course1 course) {
		courses.add(course);
		System.out.println("Student " + studentName +
						   " enrolled in course " + course.courseName);
	}

	//method to display enrolled courses
	void displayCourses() {
		System.out.println("Student Name: " + studentName);
		for (Course1 course : courses) {
			System.out.println("Enrolled Course: " + course.courseName);
		}
	}
}

//class to represent a Professor
class Professor {
	//instance variables
	int professorId;
	String professorName;
	ArrayList<Course1> courses = new ArrayList<Course1>();

	//constructor to initialize professor details
	Professor(int professorId, String professorName) {
		this.professorId = professorId;
		this.professorName = professorName;
	}

	//method to teach a course
	void teachCourse(Course1 course) {
		courses.add(course);
	}

	//method to display courses taught
	void displayCourses() {
		System.out.println("Professor Name: " + professorName);
		for (Course1 course : courses) {
			System.out.println("Teaching Course: " + course.courseName);
		}
	}
}

public class UniversityManagementSystem {
	public static void main(String[] args) {

		//create students
		Student1 student1 = new Student1(101, "Amit");
		Student1 student2 = new Student1(102, "Neha");

		//create professors
		Professor professor1 = new Professor(201, "Dr. Sharma");
		Professor professor2 = new Professor(202, "Dr. Mehta");

		//create courses
		Course1 course1 = new Course1(301, "Data Structures");
		Course1 course2 = new Course1(302, "Operating Systems");

		System.out.println();

		//assign professors to courses
		course1.assignProfessor(professor1);
		professor1.teachCourse(course1);

		course2.assignProfessor(professor2);
		professor2.teachCourse(course2);

		System.out.println();

		//students enrolling in courses
		student1.enrollCourse(course1);
		student1.enrollCourse(course2);

		student2.enrollCourse(course2);

		System.out.println();

		//display student details
		student1.displayCourses();
		System.out.println();
		student2.displayCourses();

		System.out.println();

		//display professor details
		professor1.displayCourses();
		System.out.println();
		professor2.displayCourses();
	}
}