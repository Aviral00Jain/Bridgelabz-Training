package com.generic.multileveluniversitycourse;

class ResearchCourse extends CourseType {
    private String researchTopic;
    public ResearchCourse(String title, String researchTopic) {
        super(title);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayType() {
        System.out.println("Research Course: " + getTitle() + " | Topic: " + researchTopic);
    }
}