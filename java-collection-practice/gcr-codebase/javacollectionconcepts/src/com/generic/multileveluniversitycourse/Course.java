package com.generic.multileveluniversitycourse;

import java.util.ArrayList;
import java.util.List;
//create Course class
class Course<T extends CourseType> {
    private List<T> courseList = new ArrayList<>();

    public void addCourse(T course) {
        courseList.add(course);
    }
    public List<T> getCourseList() {
        return courseList;
    }
}