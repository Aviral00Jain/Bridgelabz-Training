package com.artify;

class User {
    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    // Operator usage: deduct balance
    public void deductBalance(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;
        } else {
            System.out.println("❌ Insufficient balance");
        }
    }

    public String getName() {
        return name;
    }
}
