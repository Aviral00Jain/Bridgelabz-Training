package com.sorting.hospitalqueue;

public class Patient {

	String name;
	int criticality;
	
	public Patient(String name, int criticality) {
		this.name = name;
		this.criticality = criticality;
	}
	
	public String toString() {
		return name + " criticality " + criticality;
	}
	
}