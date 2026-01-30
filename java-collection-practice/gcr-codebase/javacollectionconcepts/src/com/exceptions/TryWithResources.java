package com.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TryWithResources {
	public static void main(String[] args) {
        // try-with-resources ensures auto-closing of BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\input.txt"))) {

            String firstLine = br.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}