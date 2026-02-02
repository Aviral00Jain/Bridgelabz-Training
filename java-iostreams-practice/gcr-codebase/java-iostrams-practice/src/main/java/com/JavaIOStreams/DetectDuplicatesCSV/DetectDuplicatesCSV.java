package com.JavaIOStreams.DetectDuplicatesCSV;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicatesCSV {
    public static void main(String[] args) {

        String file = "src/main/java/com/JavaIOStreams/mergecsv/students_merged.csv";
        String line;

        Set<String> seenIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (!seenIds.add(id)) {
                    System.out.println("Duplicate Record Found: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}