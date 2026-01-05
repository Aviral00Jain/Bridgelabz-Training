package com.universityenrollmentsystem;

class Postgraduate extends Student {

    public Postgraduate(int id, String name, Course course) {
        super(id, name, course);
    }

    @Override
    public void assignGrade(double marks) {
        double gradePoint = (marks >= 50) ? 8 : 0;
        calculateGPA(gradePoint);
    }
}

