package com.encapsulationandpolymorphism.hospitalpatientsystem;

import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double dailyCharge;
    private List<String> medicalHistory = new ArrayList<>();

    public InPatient(int id, String name, int age,
                     int daysAdmitted, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge + 2000; // service charges
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