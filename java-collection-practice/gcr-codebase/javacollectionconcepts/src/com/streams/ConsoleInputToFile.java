package com.streams;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class ConsoleInputToFile {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        FileWriter fw = null;
        try {
            //take input from user
            System.out.print("enter your name ");
            String name = br.readLine();

            System.out.print("Enter  your age: ");
            String age = br.readLine();

            System.out.print("enter your favorite programming language: ");
            String language = br.readLine();

            //  write data to file
            fw = new FileWriter("C:\\\\Users\\\\thisi\\\\OneDrive\\\\Desktop\\\\confident\\\\copy_buffered.dat");

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");

            System.out.println("\nUser information saved successfully.");

        } catch (IOException e) {
        	
            System.out.println("Error while reading input or writing to file.");
        } finally {
            try {
                if (fw != null)
                    fw.close();
                br.close();
                
            } catch (IOException e) {
                System.out.println("Error while closing resources.");
            }
        }
    }
}