package com.student.setter.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double fees;

    @Value("101")
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Value("Saksham Jain")
    public void setName(String name) {
        this.name = name;
    }

    @Value("Java Full Stack")
    public void setCourse(String course) {
        this.course = course;
    }

    @Value("45000")
    public void setFees(double fees) {
        this.fees = fees;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Fees    : " + fees);
    }
}