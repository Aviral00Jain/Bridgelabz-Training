package com.payxpress;


public class InternetBill extends Bill implements IPayable {

	public InternetBill(double amount, String dueDate) {
		super("Internet", amount, dueDate);
	}
	@Override
	public void pay(boolean isLate) {
		double finalAmount = calculateLateFee(isLate);
		markAsPaid();
		System.out.println("Internet bill paid: " + finalAmount);
	}
	@Override
	public void sendReminder() {
		System.out.println("Internet Reminder: Pay bill to avoid service suspension.");
	}
}