package com.constructor.levelone;

public class Student {
    public int rollNumber;        // Public - accessible everywhere
    protected String name;        // Protected - accessible in same package & subclasses
    private double CGPA;          // Private - accessible only within class

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public Getter
    public double getCGPA() {
        return CGPA;
    }

    // Public Setter
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // Display Method
    public void display() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("CGPA        : " + CGPA);
        System.out.println("--------------------------------");
    }
}