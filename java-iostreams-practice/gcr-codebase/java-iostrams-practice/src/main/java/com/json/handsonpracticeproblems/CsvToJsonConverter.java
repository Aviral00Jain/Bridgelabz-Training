package com.json.handsonpracticeproblems;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CsvToJsonConverter {

	public static void main(String[] args) throws Exception {

		// CSV mapper and schema (with header)
		CsvMapper csvMapper = new CsvMapper();
		CsvSchema schema = CsvSchema.emptySchema().withHeader();

		// Read CSV into List of Maps
		List<Object> csvData = csvMapper.readerFor(Map.class).with(schema).readValues(new File("src/main/java/com/JavaIOStreams/filtercsv/student.csv"))
				.readAll();

		// Convert to JSON
		ObjectMapper jsonMapper = new ObjectMapper();
		String json = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(csvData);

		// Print JSON
		System.out.println(json);
	}
}