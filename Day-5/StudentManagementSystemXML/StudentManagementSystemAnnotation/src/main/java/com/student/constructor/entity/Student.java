package com.student.constructor.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int rollNo;
    private String name;
    private String course;
    private double fees;

    public Student(
            @Value("101") int rollNo,
            @Value("Saksham Jain") String name,
            @Value("Java Full Stack") String course,
            @Value("45000") double fees) {

        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.fees = fees;
    }

    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Fees    : " + fees);
    }
}