package com.json.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateJsonUsingJackson {

	public static void main(String[] args) {

		// JSON string to validate
		String json = "{ \"name\": \"Ayush\", \"age\": 22 }";

		ObjectMapper mapper = new ObjectMapper();

		try {
			// Try parsing JSON
			mapper.readTree(json);

			System.out.println("Valid JSON");

		} catch (Exception e) {
			System.out.println("Invalid JSON");
		}
	}
}