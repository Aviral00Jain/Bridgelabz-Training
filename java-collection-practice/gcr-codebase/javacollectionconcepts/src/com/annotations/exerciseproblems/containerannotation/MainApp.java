package com.annotations.exerciseproblems.containerannotation;

import java.lang.reflect.Method;

public class MainApp {

	public static void main(String[] args) {

		try {
			Class<TaskService> cls = TaskService.class;

			Method method = cls.getMethod("processTask");

			BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);
			for (BugReport bug : bugReports) {
				System.out.println("Bug: " + bug.description());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}