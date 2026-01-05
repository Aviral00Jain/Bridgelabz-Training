package com.encapsulationandpolymorphism.hospitalpatientsystem;

import java.util.ArrayList;
import java.util.List;

public class HospitalPatientManagement {
    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(101, "Rahul", 45, 5, 3000);
        p1.addRecord("Diabetes");
        p1.addRecord("Blood Test");

        OutPatient p2 = new OutPatient(102, "Anita", 30, 800);
        p2.addRecord("Fever");

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {
            patient.getPatientDetails();

            double bill = patient.calculateBill();
            System.out.println("Total Bill: " + bill);

            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }

            System.out.println("---------------------------");
        }
    }
}