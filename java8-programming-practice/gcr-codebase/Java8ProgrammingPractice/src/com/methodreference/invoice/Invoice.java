package com.methodreference.invoice;

// Invoice class
public class Invoice {
	int transactionId;

	// Constructor that accepts transaction ID
	public Invoice(int transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		return "Invoice created for Transaction ID: " + transactionId;
	}
}