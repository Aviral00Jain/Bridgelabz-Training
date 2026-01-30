package com.exceptions.bankmanagement;

public class BankAccount {

    private double balance;
    // constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }
    // withdraw method
    public void withdraw(double amount)
            throws InsufficientBalanceException, IllegalArgumentException {

        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount!");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
    // main method
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5000);

        try {
            account.withdraw(2000);   
            

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}