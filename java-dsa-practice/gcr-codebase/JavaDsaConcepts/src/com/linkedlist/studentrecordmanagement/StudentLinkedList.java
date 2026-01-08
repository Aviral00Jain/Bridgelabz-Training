package com.linkedlist.studentrecordmanagement;

public class StudentLinkedList {

    private StudentNode head;

    // Inserting at start
    public void addStart(int roll, String name, int age, char grade){
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Inserting at end
    public void addEnd(int roll, String name, int age, char grade){
        StudentNode newNode = new StudentNode(roll, name, age , grade);

        if(head == null){
            head = newNode;
            return ;
        }

        StudentNode temp = head;
        while(temp.next!=null){
            temp= temp.next;
        }
        temp.next= newNode;
    }

    // Add at specific position
    public void addPosition(int position, int roll, String name, int age , char grade) {
        if (position == 1) {
            addStart(roll, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position");
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by roll number
    public void deleteByRollNumber(int roll){
        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student deleted");
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted");
        }
    }

    // Search by roll number
    public void searchStudent(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Update grade
    public void updateGrade(int roll, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records");
            return;
        }

        StudentNode temp = head;
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

    private void displayStudent(StudentNode s) {
        System.out.println(
                "Roll: " + s.rollNumber +
                        ", Name: " + s.name +
                        ", Age: " + s.age +
                        ", Grade: " + s.grade
        );
    }
}

    
