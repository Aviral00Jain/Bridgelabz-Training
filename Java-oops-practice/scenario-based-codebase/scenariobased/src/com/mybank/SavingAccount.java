package com.mybank;

public class SavingAccount extends Account{
	
	private final double InterestRate = 4.0;


	SavingAccount(String accountNumber, double balance){
		super(accountNumber, balance);
	}
	
	public double calculateInterest() {
		return getBalance() * InterestRate /100;
	}
	
}
