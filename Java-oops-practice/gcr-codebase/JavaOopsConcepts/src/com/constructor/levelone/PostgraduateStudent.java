package com.constructor.levelone;

public class PostgraduateStudent extends Student {

    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void showPGDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number   : " + rollNumber);    // public (allowed)
        System.out.println("Name          : " + name);          // protected (allowed)
        System.out.println("CGPA          : " + getCGPA());     // private -> accessed via getter
        System.out.println("Specialization: " + specialization);
        System.out.println("--------------------------------");
    }
}