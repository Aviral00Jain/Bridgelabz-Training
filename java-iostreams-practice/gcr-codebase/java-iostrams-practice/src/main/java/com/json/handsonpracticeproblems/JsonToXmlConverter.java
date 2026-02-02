package com.json.handsonpracticeproblems;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXmlConverter {

	public static void main(String[] args) throws Exception {

		ObjectMapper jsonMapper = new ObjectMapper();
		XmlMapper xmlMapper = new XmlMapper();

		// Read JSON file
		JsonNode jsonNode = jsonMapper.readTree(new File("src/main/java/com/JavaIOStreams/filtercsv/student.csv"));

		// Convert JSON to XML
		String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(jsonNode);

		// Print XML
		System.out.println(xml);
	}
}