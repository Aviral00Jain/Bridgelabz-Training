package com.json.practiceproblems;

import org.json.JSONObject;

public class MergeJsonObjects {

    public static void main(String[] args) {

        // First JSON object
        JSONObject json1 = new JSONObject();
        json1.put("name", "Ayush");
        json1.put("age", 22);

        // Second JSON object
        JSONObject json2 = new JSONObject();
        json2.put("email", "Ayush@gmail.com");
        json2.put("course", "Java Full Stack");

        // Merge json2 into json1
        for(String key:json2.keySet()) {
        	json1.put(key, json2.get(key));
        }

        // Result merged JSON
        System.out.println(json1.toString(4));
    }
}