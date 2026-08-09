package com.student.entity;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double fees;

    // Default Constructor
    public Student() {
        System.out.println("Default Constructor Called...");
    }

    // Parameterized Constructor
    public Student(int rollNo, String name, String course, double fees) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getFees() {
        return fees;
    }

    // Setters
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo +
                ", name=" + name +
                ", course=" + course +
                ", fees=" + fees + "]";
    }
}