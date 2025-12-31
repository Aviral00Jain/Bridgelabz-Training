package com.objectmodeling;

import java.util.*;

class Bank {
    private String bankName;
    private List<Customer> customers = new ArrayList<>();

    Bank(String bankName) {
        this.bankName = bankName;
    }

    // Bank associates customer (not owning their lifecycle)
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println(customer.getName() + " is now associated with " + bankName);
    }

    // Bank helps customer open account
    public Account openAccount(Customer customer, double initialBalance) {
        Account account = new Account(this, customer, initialBalance);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " in " + bankName);
        return account;
    }

    public String getBankName() {
        return bankName;
    }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("\n--- Account Summary for " + name + " ---");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getBankName() +
                               " | Balance: " + acc.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    Account(Bank bank, Customer customer, double balance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }
}

public class BankAccountHolders {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");

        Customer c1 = new Customer("Aviral");
        Customer c2 = new Customer("Raj");

        bank.addCustomer(c1);
        bank.addCustomer(c2);

        bank.openAccount(c1, 5000);
        bank.openAccount(c1, 12000);
        bank.openAccount(c2, 8000);

        c1.viewBalance();
        c2.viewBalance();
        
    }
}