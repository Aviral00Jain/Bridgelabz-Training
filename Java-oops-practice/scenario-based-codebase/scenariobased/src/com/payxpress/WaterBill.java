package com.payxpress;


public class WaterBill extends Bill implements IPayable {

	public WaterBill(double amount, String dueDate) {
		super("Water", amount, dueDate);
	}

	public void pay(boolean isLate) {
		double finalAmount = calculateLateFee(isLate);
		markAsPaid();
		System.out.println("Water bill paid: " + finalAmount);
	}

	public void sendReminder() {
		System.out.println("Water Reminder: Clear dues to ensure uninterrupted supply.");
	}
}