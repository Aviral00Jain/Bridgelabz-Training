package com.encapsulationandpolymorphism.banksystem;

public interface Loanable {
	void applyForLoan(double amount);
    double calculateLoanEligibility();
}