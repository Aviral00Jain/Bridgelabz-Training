package com.student.field.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("101")
    private int rollNo;

    @Value("Saksham Jain")
    private String name;

    @Value("Java Full Stack")
    private String course;

    @Value("45000")
    private double fees;

    public void display() {

        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Fees    : " + fees);
    }
}