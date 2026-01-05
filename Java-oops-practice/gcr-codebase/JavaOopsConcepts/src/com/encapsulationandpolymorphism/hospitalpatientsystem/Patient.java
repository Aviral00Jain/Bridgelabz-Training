package com.encapsulationandpolymorphism.hospitalpatientsystem;

public abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Sensitive medical data (encapsulated)
    private String diagnosis;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Controlled access (encapsulation)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}