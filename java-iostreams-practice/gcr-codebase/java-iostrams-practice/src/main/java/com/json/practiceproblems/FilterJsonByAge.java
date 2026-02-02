package com.json.practiceproblems;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJsonByAge {

	public static void main(String[] args) throws Exception {

		// JSON array input
		String json = """
				[
				    { "name": "Ayush", "age": 22 },
				    { "name": "Amit", "age": 28 },
				    { "name": "Rahul", "age": 30 },
				    { "name": "Neha", "age": 24 }
				]
				""";

		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(json);

		// Parse and filter age > 25
		for (JsonNode node : rootNode) {
			if (node.get("age").asInt() > 25) {
				System.out.println(node.toPrettyString());
			}
		}
	}
}