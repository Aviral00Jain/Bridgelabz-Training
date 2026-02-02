package com.json.handsonpracticeproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterUsersByAge {

	public static void main(String[] args) throws Exception {

		// JSON array input
		String json = """
				[
				    { "name": "Ayush", "age": 22 },
				    { "name": "Aman", "age": 28 },
				    { "name": "Rahul", "age": 30 },
				    
				]
				""";

		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(json);

		// Filter and print users older than 25
		for (JsonNode node : rootNode) {
			if (node.get("age").asInt() > 25) {
				System.out.println(node.toPrettyString());
			}
		}
	}
}