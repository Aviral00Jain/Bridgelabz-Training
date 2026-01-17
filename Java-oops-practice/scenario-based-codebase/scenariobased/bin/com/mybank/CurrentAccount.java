package com.mybank;

public class CurrentAccount extends Account {
	
	private final double InterestRate = 1.0;

	public CurrentAccount(String accountNumber, double balance){
		super(accountNumber, balance);
	}
	
	public double calculateInterest() {
		return getBalance() * InterestRate /100;
	}
	
}
