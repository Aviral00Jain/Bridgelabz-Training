package com.markerinterface.dataserialization;

public class BackupTest {
	public static void main(String[] args) {
		PatientRecord record = new PatientRecord(101, "Anupam");
		SessionCache cache = new SessionCache("ABC123");

		BackupService.backup(record);
		BackupService.backup(cache);
	}
}