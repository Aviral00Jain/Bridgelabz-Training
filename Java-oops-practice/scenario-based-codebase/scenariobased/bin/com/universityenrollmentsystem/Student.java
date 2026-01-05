package com.universityenrollmentsystem;

abstract class Student implements Graded {

    private int studentId;
    private String name;

    // GPA is sensitive → encapsulated
    private double gpa;

    protected Course enrolledCourse;

    // Constructor without electives
    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Constructor with elective preference
    public Student(int studentId, String name, Course course) {
        this.studentId = studentId;
        this.name = name;
        this.enrolledCourse = course;
    }

    // GPA calculation (operators used)
    protected void calculateGPA(double gradePoint) {
        gpa = (gpa + gradePoint) / 2;
    }

    // Public method to access transcript
    public void viewTranscript() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Course: " +
                (enrolledCourse != null ? enrolledCourse.getCourseName() : "Not Enrolled"));
        System.out.println("GPA: " + gpa);
        System.out.println("----------------------------");
    }
}

