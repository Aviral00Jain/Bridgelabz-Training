package com.markerinterface.dataserialization;

public class PatientRecord implements BackupEligible {
	int id;
	String name;

	public PatientRecord(int id, String name) {
		this.id = id;
		this.name = name;
	}
}