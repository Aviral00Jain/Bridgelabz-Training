package com.universityenrollmentsystem;

class Undergraduate extends Student {

    public Undergraduate(int id, String name, Course course) {
        super(id, name, course);
    }

    @Override
    public void assignGrade(double marks) {
        double gradePoint;

        if (marks >= 90)
            gradePoint = 10;
        else if (marks >= 75)
            gradePoint = 8;
        else if (marks >= 60)
            gradePoint = 6;
        else
            gradePoint = 4;

        calculateGPA(gradePoint);
    }
}

