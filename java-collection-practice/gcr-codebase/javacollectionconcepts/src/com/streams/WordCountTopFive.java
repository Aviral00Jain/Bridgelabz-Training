package com.streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordCountTopFive {

    public static void main(String[] args) {

        String filePath = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\input.txt";
        HashMap<String, Integer> wordCount = new HashMap<>();

        //read file and count words
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = br.readLine()) != null) {

                //convert to lowercase and split words
                String[] words = line.toLowerCase().split("\\W+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCount.put(word,
                                wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error while reading the file.");
            return;
        }

        //sort words by frequency
        List<Map.Entry<String, Integer>> wordList =
                new ArrayList<>(wordCount.entrySet());

        wordList.sort((a, b) -> b.getValue() - a.getValue());

        //display top 5 words
        System.out.println("Top 5 most frequent words:");
        for (int i = 0; i < Math.min(5, wordList.size()); i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}