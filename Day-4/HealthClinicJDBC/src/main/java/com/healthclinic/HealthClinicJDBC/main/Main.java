package com.healthclinic.HealthClinicJDBC.main;

import java.util.Scanner;

import com.healthclinic.HealthClinicJDBC.dao.PatientDAO;
import com.healthclinic.HealthClinicJDBC.model.Patient;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PatientDAO patientDAO = new PatientDAO();

        int choice;

        do {

            System.out.println("\n========== HEALTH CLINIC MANAGEMENT ==========");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient By ID");
            System.out.println("4. Update Patient");
            System.out.println("5. Delete Patient");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

            case 1:

                Patient patient = new Patient();

                sc.nextLine(); // Buffer Clear

                System.out.print("Enter Patient Name : ");
                patient.setName(sc.nextLine());

                System.out.print("Enter Phone Number : ");
                patient.setPhone(sc.nextLine());

                System.out.print("Enter DOB (yyyy-mm-dd) : ");
                patient.setDob(sc.nextLine());

                patientDAO.insertPatient(patient);

                break;

            case 2:

                patientDAO.getAllPatients();

                break;

            case 3:

                System.out.print("Enter Patient ID : ");
                int id = sc.nextInt();

                patientDAO.searchPatientById(id);

                break;

            case 4:

                System.out.print("Enter Patient ID : ");
                int updateId = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter New Phone Number : ");
                String phone = sc.nextLine();

                patientDAO.updatePatient(updateId, phone);

                break;

            case 5:

                System.out.print("Enter Patient ID : ");
                int deleteId = sc.nextInt();

                patientDAO.deletePatient(deleteId);

                break;

            case 6:

                System.out.println("Thank You!");

                break;

            default:

                System.out.println("Invalid Choice!");

            }

        } while (choice != 6);

        sc.close();

    }

}