package com.markerinterface.dataserialization;

public class BackupService {
	public static void backup(Object obj) {
		if (obj instanceof BackupEligible) {
			System.out.println("Object backed up successfully");
			// serialization logic here
		} else {
			System.out.println("Object not eligible for backup");
		}
	}
}