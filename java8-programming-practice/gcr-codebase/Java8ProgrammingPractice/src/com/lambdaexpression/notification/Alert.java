package com.lambdaexpression.notification;

class Alert {
	String type; // Emergency, Medicine, Appointment
	String message;

	public Alert(String type, String message) {
		this.type = type;
		this.message = message;
	}

	@Override
	public String toString() {
		return type + " Alert: " + message;
	}
}