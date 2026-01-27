package com.streams.saveandretrieveanobject;

import java.io.*;
import java.util.ArrayList;

public class EmployeeSerialization {

    public static void main(String[] args) {

        String fileName = "C:\\Users\\thisi\\OneDrive\\Desktop\\confident\\employees.dat";

        //create employee list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Amit", "IT", 50000));
        employees.add(new Employee(102, "Neha", "HR", 45000));
        employees.add(new Employee(103, "keshav", "Finance", 6000000));

        // serialization
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(fileName))) {

            oos.writeObject(employees);
            System.out.println("employees saved successfully.");

        } catch (IOException e) {
            System.out.println("error during serialization.");
        }

        //deserialization
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(fileName))) {

            ArrayList<Employee> empList =
                    (ArrayList<Employee>) ois.readObject();

            System.out.println("\nEmployee details:");
            for (Employee e : empList) {
                e.display();
            }

        } catch (IOException e) {
            System.out.println("error during deserialization.");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}