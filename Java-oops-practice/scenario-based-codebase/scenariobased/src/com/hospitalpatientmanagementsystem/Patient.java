package com.hospitalpatientmanagementsystem;

abstract class Patient {
	// instance variables
	private int patientId;
	private String name;
	private String medicalHistory; // sensitive data -> private
	protected String assignedDoctor;

	// Normal Admission Constructor
	public Patient(int patientId, String name) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = "Not Available";
	}

	// Emergency Admission Constructor (Overloaded)
	public Patient(int patientId, String name, String medicalHistory) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = medicalHistory;
	}

	// Encapsulation -> Getters / Setters
	public int getPatientId() {
		return patientId;
	}

	//getName()
	public String getName() {
		return name;
	}

	//getMedicalHistory()
	private String getMedicalHistory() { // fully private
		return medicalHistory;
	}
	
	//getSummary()
	public String getSummary() {
		return "Patient ID: " + patientId + ", Name: " + name;
	}

	//assignDoctor()
	public void assignDoctor(String doctorName) {
		this.assignedDoctor = doctorName;
	}

	// Polymorphism method
	public abstract void displayInfo();
}