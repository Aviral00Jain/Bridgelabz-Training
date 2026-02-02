package com.json.handsonpracticeproblems;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeTwoJsonFiles {

	public static void main(String[] args) throws Exception {

		ObjectMapper mapper = new ObjectMapper();

		// Read both JSON files
		ObjectNode json1 = (ObjectNode) mapper.readTree(new File("src/main/java/com/Json/file1.json"));
		ObjectNode json2 = (ObjectNode) mapper.readTree(new File("src/main/java/com/Json/file1.json"));

		// Merge json2 into json1
		json1.setAll(json2);

		// Print merged JSON object
		System.out.println(json1.toPrettyString());
	}
}