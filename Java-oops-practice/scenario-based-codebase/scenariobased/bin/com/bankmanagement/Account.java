package com.bankmanagement;

class Account {
	// instance variables
	protected String accountNumber;
	protected double balance;

	// Constructor
	Account(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Deposit method
	public void deposit(double amount) {
		balance += amount;
		System.out.println(amount + " deposited. New Balance = " + balance);
	}

	// withdraw method
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(amount + " withdrawn. New Balance = " + balance);
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	// display method
	public void display() {
		System.out.println("Account No: " + accountNumber);
		System.out.println("Balance: " + balance);
	}
}