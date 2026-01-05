package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

class Course {
    protected String courseName;
    protected int duration; // in hours

    // Constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}