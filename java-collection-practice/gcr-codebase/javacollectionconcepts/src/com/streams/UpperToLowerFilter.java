package com.streams;

import java.io.*;

public class UpperToLowerFilter {

    public static void main(String[] args) {

        String sourceFile = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\input.txt";
        String destinationFile = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\output.txt";

        try (
            BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            int ch;

            //Read character by character
            while ((ch = br.read()) != -1) {
                //convert uppercase to lowercase
                bw.write(Character.toLowerCase((char) ch));
            }

            System.out.println("File converted successfully.");

        } catch (IOException e) {
            System.out.println(" error while processing the file.");
        }
    }
}