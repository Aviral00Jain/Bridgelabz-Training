package com.json.practiceproblems;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {

	public static void main(String[] args) {

		// Create JSON Object
		JSONObject student = new JSONObject();
		student.put("name", "Ayush");
		student.put("age", 22);

		// Create JSON Array for subjects
		JSONArray subjects = new JSONArray();
		subjects.put("Java");
		subjects.put("Spring Boot");
		subjects.put("MySQL");

		student.put("subjects", subjects);

		// Print JSON
		System.out.println(student.toString(4));
	}
}