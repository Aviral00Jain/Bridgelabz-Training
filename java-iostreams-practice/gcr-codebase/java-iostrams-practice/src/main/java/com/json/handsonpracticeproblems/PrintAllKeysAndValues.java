package com.json.handsonpracticeproblems;

import java.io.File;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintAllKeysAndValues {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON file
        JsonNode rootNode = mapper.readTree(new File("D:\\File Handling\\JSON\\students.json"));

        // Print all keys and values
        rootNode.fields().forEachRemaining(entry -> {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
    }
}