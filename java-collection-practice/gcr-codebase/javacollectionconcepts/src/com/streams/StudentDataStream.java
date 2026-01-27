package com.streams;

import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\student.txt";

        //writing data to binary file
        try (DataOutputStream dos =
                     new DataOutputStream(new FileOutputStream(fileName))) {

            dos.writeInt(101);              
            dos.writeUTF("Amit");           
            dos.writeDouble(8.5);           

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println(" error while writing data.");
        }

        //reading data from binary file
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(fileName))) {

            int roll = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            //display data
            System.out.println("\nStudent details:");
            System.out.println("roll Number: " + roll);
            System.out.println(" Name: " + name);
            System.out.println(" gpa : " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading data.");
        }
    }
}
