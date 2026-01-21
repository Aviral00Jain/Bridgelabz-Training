package com.generic.multileveluniversitycourse;

public abstract class CourseType {
	private String title;
	
	public CourseType(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public abstract void displayType();
}