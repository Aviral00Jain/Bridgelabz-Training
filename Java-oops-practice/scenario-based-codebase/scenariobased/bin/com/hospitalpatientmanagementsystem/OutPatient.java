package com.hospitalpatientmanagementsystem;

class OutPatient extends Patient {
	public OutPatient(int id, String name) {
		super(id, name);
	}

	@Override
	public void displayInfo() {
		System.out.println("OutPatient: " + getSummary());
	}
}