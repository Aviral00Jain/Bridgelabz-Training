package com.generic.multileveluniversitycourse;

class AssignmentCourse extends CourseType {
    private int totalAssignments;

    public AssignmentCourse(String title, int totalAssignments) {
        super(title);
        this.totalAssignments = totalAssignments;
    }

    @Override
    public void displayType() {
        System.out.println("Assignment Course: " + getTitle() + " | Assignments: " + totalAssignments);
    }
}