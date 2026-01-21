package com.generic.multileveluniversitycourse;
//create University system
public class UniversitySystem {
    public static void main(String[] args) {

        // Create course containers
        Course<ExamCourse> examCourses = new Course<>();
        Course<AssignmentCourse> assignmentCourses = new Course<>();
        Course<ResearchCourse> researchCourses = new Course<>();
        //add courses
        examCourses.addCourse(new ExamCourse("Math 101", 100));
        examCourses.addCourse(new ExamCourse("physics 101", 80));
        assignmentCourses.addCourse(new AssignmentCourse("English 101", 5));
        assignmentCourses.addCourse(new AssignmentCourse("history  101", 4));

        researchCourses.addCourse(new ResearchCourse("Ai 101", "Machine learning"));
        researchCourses.addCourse(new ResearchCourse("bio 101", "Genetics"));

        // Display courses 
        System.out.println("--Exam Courses--");
        CourseUtility.displayCourses(examCourses.getCourseList());
        System.out.println("\n--- Assignment Courses ----");
        CourseUtility.displayCourses(assignmentCourses.getCourseList());

        System.out.println("-- Research Courses-");
        CourseUtility.displayCourses(researchCourses.getCourseList());
    }
}