package com.universityenrollmentsystem;

class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public String getCourseName() {
        return courseName;
    }
}

