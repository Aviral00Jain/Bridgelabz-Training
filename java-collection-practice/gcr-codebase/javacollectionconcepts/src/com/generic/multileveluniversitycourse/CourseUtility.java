package com.generic.multileveluniversitycourse;
import java.util.List;
//create CourseUtility

public class CourseUtility {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayType();
        }
    }
}