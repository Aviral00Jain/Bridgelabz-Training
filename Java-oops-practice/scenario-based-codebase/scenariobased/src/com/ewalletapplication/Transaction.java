package com.ewalletapplication;

class Transaction {
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String toString() {
        return description + " : ₹" + amount;
    }
}

