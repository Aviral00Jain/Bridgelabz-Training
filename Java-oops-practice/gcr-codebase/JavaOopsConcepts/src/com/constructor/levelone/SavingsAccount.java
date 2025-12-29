package com.constructor.levelone;


public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void showSavingsDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number : " + accountNumber);   // public → accessible
        System.out.println("Account Holder : " + accountHolder);   // protected → accessible
        System.out.println("Balance        : ₹" + getBalance());   // private → via getter
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.println("--------------------------------");
        
    }
}