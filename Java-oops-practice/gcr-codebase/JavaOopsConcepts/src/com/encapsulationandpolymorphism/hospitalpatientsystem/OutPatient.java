package com.encapsulationandpolymorphism.hospitalpatientsystem;

import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private List<String> medicalHistory = new ArrayList<>();

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical History: " + medicalHistory);
    }
}