package com.skillforge;

import java.util.List;

class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, List<String> modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate(Student student) {
        if (student.getProgress() >= 90) {
            System.out.println("Advanced Certificate with Honors awarded to " + student.getName());
        } else {
            System.out.println("90% progress required for Advanced certificate");
        }
    }
}
