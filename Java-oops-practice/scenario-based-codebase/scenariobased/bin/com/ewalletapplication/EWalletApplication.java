package com.ewalletapplication;

public class EWalletApplication {

    public static void main(String[] args) {

        Wallet personalWallet = new PersonalWallet(5000, 500);
        Wallet businessWallet = new BusinessWallet(20000);

        User user1 = new User("U101", "Amit", personalWallet);
        User user2 = new User("U201", "Neha", businessWallet);

        // Polymorphic transfer
        user1.getWallet().transferTo(user2, 3000);
        user2.getWallet().transferTo(user1, 5000);

        System.out.println("\nAmit Balance: ₹" + user1.getWallet().getBalance());
        System.out.println("Neha Balance: ₹" + user2.getWallet().getBalance());

        System.out.println("\nAmit Transactions:");
        user1.getWallet().showTransactions();

        System.out.println("\nNeha Transactions:");
        user2.getWallet().showTransactions();
    }
}

