package com.JavaIOStreams.validatecsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSV {
    public static void main(String[] args) {
        String file = "src/main/java/com/JavaIOStreams/validatecsv/users.csv";
        String line;

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                boolean emailValid = emailPattern.matcher(data[2]).matches();
                boolean phoneValid = phonePattern.matcher(data[3]).matches();

                if (!emailValid || !phoneValid) {
                    System.out.println("Invalid Row: " + line);

                    if (!emailValid)
                        System.out.println("  ❌ Invalid Email");

                    if (!phoneValid)
                        System.out.println("  ❌ Invalid Phone Number");

                    System.out.println("----------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file");
        }
    }
}