package com.loanbuddy;

public class LoanBuddy {

    public static void main(String[] args) {

        Applicant applicant = new Applicant(
                "Ayush",
                920,
                60000,
                1000000
        );

        LoanApplication loan = new HomeLoan(240); 
        
        if (loan.approveLoan(applicant)) {
            double emi = loan.calculateEMI(applicant);
            System.out.println("Loan Approved!");
            System.out.println("Monthly EMI: " + emi);
        } else {
            System.out.println("Loan Rejected!");
        }
    }
}
