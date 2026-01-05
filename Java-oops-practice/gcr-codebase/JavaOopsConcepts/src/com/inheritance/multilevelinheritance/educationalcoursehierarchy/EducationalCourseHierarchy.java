package com.inheritance.multilevelinheritance.educationalcoursehierarchy;

public class EducationalCourseHierarchy {
    public static void main(String[] args) {

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Udemy",
                true,
                15000,
                20
        );

        System.out.println("---- Course Details ----");
        course.displayDetails();
    }
}