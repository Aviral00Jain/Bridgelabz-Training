package com.loanbuddy;

public class HomeLoan extends LoanApplication {

	public HomeLoan(int term) {
		  super("Home Loan", term, 0.8);
	}
	
	public boolean approveLoan(Applicant applicant) {
		loanApproved = applicant.getCreditScore() >= 700 && applicant.getIncome() >= 50000;
		return loanApproved;
	}
	
	public double calculateEMI(Applicant applicant) {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12;
        int N = term;

        return (P * R * Math.pow(1 + R, N)) / (Math.pow(1 + R, N) - 1);
    }
}
