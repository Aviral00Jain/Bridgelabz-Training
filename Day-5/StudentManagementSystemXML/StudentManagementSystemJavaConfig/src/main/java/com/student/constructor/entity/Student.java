package com.student.constructor.entity;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double fees;

    // Parameterized Constructor
    public Student(int rollNo, String name, String course, double fees) {
        System.out.println("Parameterized Constructor Called");

        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
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