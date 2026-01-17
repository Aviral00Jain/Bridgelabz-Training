package com.constructor.levelone;

public class StudentDriver {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Rohit Sharma", 8.7);

        System.out.println("Student Details:");
        s1.display();

        // Modify CGPA using setter
        s1.setCGPA(9.1);
        System.out.println("After Updating CGPA:");
        s1.display();

        // Postgraduate Student
        PostgraduateStudent pg = new PostgraduateStudent(201, "Aaditya Joshi", 9.3, "Computer Science");
        pg.showPGDetails();
    }
}