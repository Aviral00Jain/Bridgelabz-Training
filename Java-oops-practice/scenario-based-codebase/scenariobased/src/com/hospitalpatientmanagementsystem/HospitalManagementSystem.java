package com.hospitalpatientmanagementsystem;

public class HospitalManagementSystem {
	public static void main(String[] args) {

		Doctor d1 = new Doctor(101, "Dr. sagel", "Cardiologist");
		d1.displayInfo();

		InPatient p1 = new InPatient(1, "Ayush", "Head Ache", 5);
		p1.assignDoctor("Dr. Mehta");
		p1.displayInfo();

		OutPatient p2 = new OutPatient(2, "Rahul");
		p2.assignDoctor("Dr. Mehta");
		p2.displayInfo();

		InPatient p3 = new InPatient(2, "Aaditya", "Hemorrhoid", 10);
		p3.assignDoctor("Dr. bangali");
		p3.displayInfo();

		// Billing
		Bill bill2 = new Bill(p3, 50000);
		bill2.printBill();

	}
}