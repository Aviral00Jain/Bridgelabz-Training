package com.campusconnect;

import java.util.ArrayList;

class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        students = new ArrayList<>();
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void removeStudent(Student student) {
        students.remove(student);
    }

    void showCourseDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}
