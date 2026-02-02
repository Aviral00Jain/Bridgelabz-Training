package com.json.handsonpracticeproblems;

import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.networknt.schema.BaseJsonValidator;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class ValidateEmailUsingJsonSchema {

	public static void main(String[] args) throws Exception {

		// JSON data to validate
		String jsonData = """
				{
				    "email": "vikash@gmail.com"
				}
				""";

		// JSON Schema definition
		String jsonSchemaData = """
				{
				  "type": "object",
				  "properties": {
				    "email": {
				      "type": "string",
				      "format": "email"
				    }
				  },
				  "required": ["email"]
				}
				""";

		ObjectMapper mapper = new ObjectMapper();

		JsonNode jsonNode = mapper.readTree(jsonData);
		JsonNode schemaNode = mapper.readTree(jsonSchemaData);

		JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

		BaseJsonValidator schema = factory.getSchema(schemaNode);

		// Validate JSON against schema
		Set<ValidationMessage> errors = schema.validate(jsonNode);

		if (errors.isEmpty()) {
			System.out.println("Valid Email");
		} else {
			System.out.println("Invalid Email");
		}
	}
}