package com.skillforge;

class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() >= 80) {
            System.out.println("Beginner Certificate awarded to " + student.getName());
        } else {
            System.out.println("Complete at least 80% to get certificate");
        }
    }
}
