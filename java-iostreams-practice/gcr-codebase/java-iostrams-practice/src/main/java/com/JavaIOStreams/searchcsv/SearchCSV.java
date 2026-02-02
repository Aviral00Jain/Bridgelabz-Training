package com.JavaIOStreams.searchcsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchCSV {
    public static void main(String[] args) {
        String file = "src/main/java/com/iostream/writecsv/employees.csv";
        String searchName = "Aditya";
        String line;
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data[1].equalsIgnoreCase(searchName)) {
                    System.out.println("Name       : " + data[1]);
                    System.out.println("Department : " + data[2]);
                    System.out.println("Salary     : " + data[3]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found");
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}