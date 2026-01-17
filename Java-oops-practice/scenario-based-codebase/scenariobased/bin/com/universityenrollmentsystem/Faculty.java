package com.universityenrollmentsystem;

class Faculty {

    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    public void gradeStudent(Student student, double marks) {
        student.assignGrade(marks); // polymorphic call
        System.out.println("Graded by: " + facultyName);
    }
}
