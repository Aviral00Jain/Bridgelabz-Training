package com.universityenrollmentsystem;

class Enrollment {

    public static void enroll(Student student, Course course) {
        student.enrolledCourse = course;
        System.out.println("Enrolled in course: " + course.getCourseName());
    }
}

