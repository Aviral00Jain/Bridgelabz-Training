package com.student.setter.entity;

public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double fees;

    public Student() {
        System.out.println("Default Constructor Called");
    }

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
        return "Student [rollNo=" + rollNo + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
    }
}