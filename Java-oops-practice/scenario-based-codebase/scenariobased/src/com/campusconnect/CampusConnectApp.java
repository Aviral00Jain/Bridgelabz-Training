package com.campusconnect;

public class CampusConnectApp {

    public static void main(String[] args) {

        Faculty faculty = new Faculty(
                101, "Dr. Sharma", "sharma@college.edu", "Computer Science"
        );

        double[] grades = {8.5, 9.0, 8.8};
        Student student = new Student(
                201, "Ayush", "ayush@student.edu", grades
        );

        Course course = new Course("Data Structures", faculty);

        // Enroll student
        student.enrollCourse(course);

        // Polymorphism in action
        Person p1 = student;
        Person p2 = faculty;

        System.out.println("\n--- Person Details ---");
        p1.printDetails();
        System.out.println();
        p2.printDetails();

        course.showCourseDetails();
    }
}
