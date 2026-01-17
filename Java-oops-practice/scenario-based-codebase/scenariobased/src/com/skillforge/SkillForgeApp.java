package com.skillforge;

import java.util.Arrays;

public class SkillForgeApp {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("Dr. Smith");
        Student student = new Student("Ayush");

        Course javaCourse = new AdvancedCourse("Advanced Java",instructor,  Arrays.asList("OOP", "Collections", "JVM", "Multithreading"));

        student.updateProgress(4, 4); // Operator usage

        javaCourse.generateCertificate(student);
    }
}
