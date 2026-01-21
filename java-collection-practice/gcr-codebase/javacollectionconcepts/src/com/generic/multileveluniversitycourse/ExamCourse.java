package com.generic.multileveluniversitycourse;

public class ExamCourse extends CourseType {
    private int totalMarks;

    public ExamCourse(String title, int totalMarks) {
        super(title);
        this.totalMarks = totalMarks;
    }
    @Override
    public void displayType() {
        System.out.println("Exam Course: " + getTitle() + " | Marks: " + totalMarks);
    }
}
