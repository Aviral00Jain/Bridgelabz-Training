package com.universityenrollmentsystem;

public class UniversityCourseEnrollmentSystem {

    public static void main(String[] args) {

        Course java = new Course("CS101", "Java Programming", 4);
        Course ai = new Course("CS501", "Artificial Intelligence", 5);

        Student ugStudent = new Undergraduate(1, "Ayush", java);
        Student pgStudent = new Postgraduate(2, "Neha", ai);

        Faculty faculty = new Faculty("Dr. Sharma");

        Enrollment.enroll(ugStudent, java);
        Enrollment.enroll(pgStudent, ai);

        // Polymorphism in grading
        faculty.gradeStudent(ugStudent, 82); // letter grading
        faculty.gradeStudent(pgStudent, 45); // pass/fail grading

        ugStudent.viewTranscript();
        pgStudent.viewTranscript();
    }
}