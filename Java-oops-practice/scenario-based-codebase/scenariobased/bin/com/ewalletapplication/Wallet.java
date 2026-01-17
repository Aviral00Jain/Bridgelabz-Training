package com.ewalletapplication;

import java.util.ArrayList;
import java.util.List;

abstract class Wallet implements Transferrable {

    private double balance; // encapsulated
    protected List<Transaction> transactions = new ArrayList<>();

    // Constructor without referral bonus
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    // Constructor with referral bonus
    public Wallet(double initialBalance, double referralBonus) {
        this.balance = initialBalance + referralBonus;
        transactions.add(new Transaction("Referral Bonus", referralBonus));
    }

    public double getBalance() {
        return balance;
    }

    protected void addBalance(double amount) {
        balance += amount;
    }

    protected boolean deductBalance(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void showTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
