package com.sorting.examcell;

public class Main {
    public static void main(String[] args) {

        Student[] students = {
            new Student("Aman", 88),
            new Student("Riya", 92),
            new Student("Karan", 75),
            new Student("Neha", 92),
            new Student("Vikas", 81)
        };

        MergeSort.mergeSort(students, 0, students.length - 1);

        System.out.println("📊 State-Level Rank List");
        int rank = 1;
        for (Student s : students) {
            System.out.println("Rank " + rank++ + " → " + s);
        }
    }
}