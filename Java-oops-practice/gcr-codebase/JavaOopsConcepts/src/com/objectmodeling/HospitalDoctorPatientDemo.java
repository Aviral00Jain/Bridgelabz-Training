package com.objectmodeling;

import java.util.ArrayList;

//class to represent a Patient
class Patient {
	//instance variables
	int patientId;
	String patientName;

	//constructor to initialize patient details
	Patient(int patientId, String patientName) {
		this.patientId = patientId;
		this.patientName = patientName;
	}

	//method to display patient details
	void displayPatient() {
		System.out.println("Patient ID: " + patientId + ", Name: " + patientName);
	}
}

//class to represent a Doctor
class Doctor {
	//instance variables
	int doctorId;
	String doctorName;
	ArrayList<Patient> patients = new ArrayList<Patient>();

	//constructor to initialize doctor details
	Doctor(int doctorId, String doctorName) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
	}

	//method to consult a patient (communication)
	void consult(Patient patient) {
		patients.add(patient);
		System.out.println("Doctor " + doctorName + " is consulting Patient " + patient.patientName);
	}

	//method to display patients consulted by doctor
	void displayPatients() {
		System.out.println("Doctor Name: " + doctorName);
		for (Patient patient : patients) {
			patient.displayPatient();
		}
	}
}

//class to represent a Hospital
class Hospital {
	//instance variables
	String hospitalName;
	ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	ArrayList<Patient> patients = new ArrayList<Patient>();

	//constructor to initialize hospital name
	Hospital(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	//method to add doctor to hospital
	void addDoctor(Doctor doctor) {
		doctors.add(doctor);
	}

	//method to add patient to hospital
	void addPatient(Patient patient) {
		patients.add(patient);
	}

	//method to display hospital details
	void displayHospitalDetails() {
		System.out.println("Hospital Name: " + hospitalName);

		System.out.println("Doctors:");
		for (Doctor doctor : doctors) {
			System.out.println("Doctor ID: " + doctor.doctorId + ", Name: " + doctor.doctorName);
		}

		System.out.println("Patients:");
		for (Patient patient : patients) {
			patient.displayPatient();
		}
	}
}

public class HospitalDoctorPatientDemo {
	public static void main(String[] args) {

		//create hospital
		Hospital hospital = new Hospital("City Care Hospital");

		//create doctors
		Doctor doctor1 = new Doctor(101, "Dr. Verma");
		Doctor doctor2 = new Doctor(102, "Dr. Singh");

		//create patients
		Patient patient1 = new Patient(201, "Amit");
		Patient patient2 = new Patient(202, "Neha");

		//add doctors and patients to hospital
		hospital.addDoctor(doctor1);
		hospital.addDoctor(doctor2);

		hospital.addPatient(patient1);
		hospital.addPatient(patient2);

		System.out.println();

		//doctor-patient consultation (association + communication)
		doctor1.consult(patient1);
		doctor1.consult(patient2);

		doctor2.consult(patient2);

		System.out.println();

		//display hospital details
		hospital.displayHospitalDetails();

		System.out.println();

		//display patients consulted by each doctor
		doctor1.displayPatients();
		System.out.println();
		doctor2.displayPatients();
	}
}