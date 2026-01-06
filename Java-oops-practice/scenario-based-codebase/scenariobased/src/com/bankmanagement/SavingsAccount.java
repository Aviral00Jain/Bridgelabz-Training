package com.bankmanagement;

class SavingsAccount extends Account {
	// instance variables
	private double interestRate;

	// Constructor
	SavingsAccount(String accountNumber, double balance, double interestRate) {
		super(accountNumber, balance);
		this.interestRate = interestRate;
	}

	// calculate interest method
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		balance += interest;
		System.out.println("Interest Added: " + interest);
		System.out.println("Updated Balance with Interest = " + balance);
	}
}
