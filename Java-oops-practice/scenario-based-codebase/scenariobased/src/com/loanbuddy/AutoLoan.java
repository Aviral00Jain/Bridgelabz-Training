package com.loanbuddy;

class AutoLoan extends LoanApplication {

    public AutoLoan(int term) {
        super("Auto Loan", term, 0.10); // 10% interest
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        loanApproved =
                applicant.getCreditScore() >= 650 &&
                applicant.getIncome() >= 30000;
        return loanApproved;
    }

    @Override
    public double calculateEMI(Applicant applicant) {
        double P = applicant.getLoanAmount();
        double R = interestRate / 12;
        int N = term;

        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
