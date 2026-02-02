package com.defaultmethods.smartvehicle;

public interface Vehicle {
	void displaySpeed();

	// New feature added safely
	default void displayBatteryStatus() {
		System.out.println("Battery status not available");
	}
}