package com.payxpress;


public abstract class Bill {

	// bill details
	private String type;
	private double amount;
	protected double latePenalty = 100.0;
	private String dueDate;
	private boolean isPaid;

	// constructor 
	public Bill(String type, double amount, String dueDate) {
		this.type = type;
		this.amount = amount;
		this.dueDate = dueDate;
		this.isPaid = false;
	}
	// protected method to mark bill as paid
	protected void markAsPaid() {
		isPaid = true;
	}
	// protected method to calculate late fee
	protected double calculateLateFee(boolean isLate) {
		if (isLate) {
			return amount + latePenalty;
		}
		return amount;
	}

	// getters 
	public String getType() {
		return type;
	}

	public double getAmount() {
		return amount;
	}
	public String getDueDate() {
		return dueDate;
	}
	public boolean isPaid() {
		return isPaid;
	}
	// abstract reminder method
	public abstract void sendReminder();
}
