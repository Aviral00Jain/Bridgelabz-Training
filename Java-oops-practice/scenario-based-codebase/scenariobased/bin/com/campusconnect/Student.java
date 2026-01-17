package com.campusconnect;

class Student extends Person implements ICourseActions {

    private double[] grades; // private for encapsulation
    private Course course;

    Student(int id, String name, String email, double[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    // GPA calculation using operators
    double calculateGPA() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        this.course = course;
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        this.course = null;
        course.removeStudent(this);
    }

    @Override
    void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
