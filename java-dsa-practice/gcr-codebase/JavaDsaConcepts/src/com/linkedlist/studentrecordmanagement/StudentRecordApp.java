package com.linkedlist.studentrecordmanagement;

public class StudentRecordApp {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addStart(1, "Aman", 20, 'A');
        list.addEnd(2, "Riya", 21, 'B');
        list.addEnd(3, "Karan", 22, 'C');

        list.addPosition(2, 4, "Neha", 19, 'A');

        System.out.println("\nAll Students:");
        list.displayAll();

        System.out.println("\nSearch Roll 2:");
        list.searchStudent(2);

        System.out.println("\nUpdate Grade:");
        list.updateGrade(3, 'A');

        System.out.println("\nAfter Update:");
        list.displayAll();

        System.out.println("\nDelete Roll 1:");
        list.deleteByRollNumber(1);

        System.out.println("\nFinal List:");
        list.displayAll();
    }
}