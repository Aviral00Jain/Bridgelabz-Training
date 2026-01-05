package com.bankmanagement;

class CurrentAccount extends Account {

	// Constructor
	CurrentAccount(String accountNumber, double balance) {
		super(accountNumber, balance);
	}

	// Can add overdraft logic later if needed
}