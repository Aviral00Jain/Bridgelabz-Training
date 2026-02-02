package com.json.handsonpracticeproblems;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ListToJsonArray {

	// Java Object
	static class User {

		private String name;
		private int age;

		public User(String name, int age) {
			this.name = name;
			this.age = age;
		}

		// Getters (required by Jackson)
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
	}

	public static void main(String[] args) throws Exception {

		// List of Java objects
		List<User> users = new ArrayList<>();
		users.add(new User("Ayush", 22));
		users.add(new User("Aman", 28));
		users.add(new User("Rahul", 30));

		// Convert List to JSON array
		ObjectMapper mapper = new ObjectMapper();
		String jsonArray = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(users);

		// Print JSON array
		System.out.println(jsonArray);
	}
}