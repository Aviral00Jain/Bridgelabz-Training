package com.payxpress;


public class ElectricityBill extends Bill implements IPayable {

	public ElectricityBill(double amount, String dueDate) {
		super("Electricity", amount, dueDate);
	}
	public void pay(boolean isLate) {
		double finalAmount = calculateLateFee(isLate);
		markAsPaid();
		System.out.println("Electricity bill paid: " + finalAmount);
	}
	public void sendReminder() {
		System.out.println("Electricity Reminder: Pay bill to avoid power disconnection.");
	}
}
