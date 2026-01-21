package com.mapinterface;
import java.util.*;
import java.io.*;

//Create WordFrequencyCounter to count frequency of words in a text file
public class WordFrequencyCounter {

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        Map<String, Integer> frequencyMap = countWordFrequency(text);
        System.out.println(frequencyMap);
    }
    //Method to count frequency of words
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> map = new HashMap<>();

        text = text.replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
        String[] words = text.split("\\s+");

        //Count frequency
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }
}