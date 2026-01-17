package com.encapsulationandpolymorphism.banksystem;

import java.util.*;

public class BankingSystem {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        BankAccount acc1 = new SavingsAccount("SB101", "Aman", 50000);
        BankAccount acc2 = new CurrentAccount("CA201", "Amit", 100000);

        accounts.add(acc1);
        accounts.add(acc2);

        for (BankAccount account : accounts) {

            account.displayAccountDetails();

            double interest = account.calculateInterest();
            System.out.println("Interest Earned: ₹" + interest);

            if (account instanceof Loanable loanable) {
                System.out.println("Loan Eligibility: ₹" + loanable.calculateLoanEligibility());
            }

            System.out.println("-----------------------------------");
        }
    }
}