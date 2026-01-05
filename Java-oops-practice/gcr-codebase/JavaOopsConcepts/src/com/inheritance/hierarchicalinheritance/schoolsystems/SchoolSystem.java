package com.inheritance.hierarchicalinheritance.schoolsystems;

public class SchoolSystem {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student student = new Student("Rahul", 16, "10th");
        Staff staff = new Staff("Suresh", 35, "Administration");

        System.out.println("---- Teacher Details ----");
        teacher.displayInfo();
        teacher.displayRole();

        System.out.println("\n---- Student Details ----");
        student.displayInfo();
        student.displayRole();

        System.out.println("\n---- Staff Details ----");
        staff.displayInfo();
        staff.displayRole();
    }
}