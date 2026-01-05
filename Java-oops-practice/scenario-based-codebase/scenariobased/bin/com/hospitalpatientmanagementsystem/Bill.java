package com.hospitalpatientmanagementsystem;

class Bill implements Payable {
	// instance variables
	private Patient patient;
	private double baseAmount;
	private double discount;
	private double tax;

	public Bill(Patient patient, double baseAmount) {
		this.patient = patient;
		this.baseAmount = baseAmount;

		// Operators used
		this.discount = baseAmount * 0.10; // 10% discount
		this.tax = baseAmount * 0.05; // 5% GST
	}

	@Override
	public double calculatePayment() {
		return baseAmount - discount + tax;
	}

	// printing the bill
	public void printBill() {
		System.out.println("------ BILL SUMMARY ------");
		System.out.println(patient.getSummary());
		System.out.println("Base Amount: " + baseAmount);
		System.out.println("Discount: " + discount);
		System.out.println("Tax: " + tax);
		System.out.println("Final Payable: " + calculatePayment());
	}
}