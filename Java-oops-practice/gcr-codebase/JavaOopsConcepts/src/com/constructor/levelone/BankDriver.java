package com.constructor.levelone;


public class BankDriver {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("ACC1001", "Rahul Sharma", 50000);
        System.out.println("Bank Account Details:");
        acc1.displayAccount();

        // Modify private balance via setter
        acc1.setBalance(62000);
        System.out.println("After Updating Balance:");
        acc1.displayAccount();

        // Savings Account
        SavingsAccount sa = new SavingsAccount("SAV2002", "Neha Verma", 80000, 6.5);
        sa.showSavingsDetails();
    }
}