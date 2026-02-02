package com.JavaIOStreams.sortcsv;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    String id;
    String name;
    String department;
    double salary;

    Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

public class SortCSV {
    public static void main(String[] args) {
        String file = "src/main/java/com/iostream/writecsv/employees.csv";
        String line;
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                list.add(new Employee(
                        data[0],
                        data[1],
                        data[2],
                        Double.parseDouble(data[3])
                ));
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV");
            return;
        }

        Collections.sort(list, Comparator.comparingDouble(e -> -e.salary));

        System.out.println("Top 5 Highest Paid Employees:");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            Employee e = list.get(i);
            System.out.println(
                    e.name + " | " +
                    e.department + " | " +
                    e.salary
            );
        }
    }
}