package com.JavaIOStreams.readlarge;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LargeCSVReader {

    private static final int BATCH_SIZE = 100;

    public static void main(String[] args) {
        String file = "src/main/java/com/iostream/mergecsv/students_merged.csv";
        String line;
        int totalCount = 0;

        List<String> batch = new ArrayList<>(BATCH_SIZE);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header (if present)

            while ((line = br.readLine()) != null) {
                batch.add(line);

                if (batch.size() == BATCH_SIZE) {
                    totalCount += batch.size();
                    processBatch(batch, totalCount);
                    batch.clear();
                }
            }

            // process remaining lines
            if (!batch.isEmpty()) {
                totalCount += batch.size();
                processBatch(batch, totalCount);
            }

        } catch (IOException e) {
            System.out.println("Error reading large CSV file");
        }
    }

    private static void processBatch(List<String> batch, int count) {
        // Simulate processing
        System.out.println("Processed records: " + count);
    }
}