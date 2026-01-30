package com.annotations.exerciseproblems.containerannotation;

public class TaskService {
	@BugReport(description = "Null pointer issue when input is empty")
	@BugReport(description = "Performance issue for large data")
	public void processTask() {
		System.out.println("Processing task...");
	}
}