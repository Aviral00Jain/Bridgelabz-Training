package com.day3.supermarket;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        SmartCheckout checkout = new SmartCheckout();

        // Add items to store
        checkout.addItemToStore("Milk", 50, 10);
        checkout.addItemToStore("Bread", 30, 5);
        checkout.addItemToStore("Eggs", 6, 20);

        // Create customers
        Customer c1 = new Customer("Rahul");
        c1.addItem("Milk", 2);
        c1.addItem("Eggs", 12);

        Customer c2 = new Customer("Anita");
        c2.addItem("Bread", 2);
        c2.addItem("Milk", 1);

        // Add customers to queue
        checkout.addCustomer(c1);
        checkout.addCustomer(c2);

        // Process customers
        checkout.processCustomer();
        checkout.processCustomer();

        // Display remaining stock
        checkout.displayStock();
    }
}