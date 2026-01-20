package com.day3.supermarket;

import java.util.*;

public class SmartCheckout {

    Queue<Customer> queue = new LinkedList<>();
    HashMap<String, Integer> priceMap = new HashMap<>();
    HashMap<String, Integer> stockMap = new HashMap<>();

    // Add item to store
    void addItemToStore(String item, int price, int stock) {
        priceMap.put(item, price);
        stockMap.put(item, stock);
    }

    // Add customer to queue
    void addCustomer(Customer customer) {
        queue.add(customer);
        System.out.println(customer.name + " added to checkout queue");
    }

    // Process next customer
    void processCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer customer = queue.poll();
        int totalBill = 0;

        System.out.println("\nProcessing customer: " + customer.name);

        for (Map.Entry<String, Integer> entry : customer.items.entrySet()) {
            String item = entry.getKey();
            int quantity = entry.getValue();

            int price = priceMap.getOrDefault(item, 0);
            int stock = stockMap.getOrDefault(item, 0);

            if (stock >= quantity) {
                totalBill += price * quantity;
                stockMap.put(item, stock - quantity);
                System.out.println(item + " x " + quantity + " = " + (price * quantity));
            } else {
                System.out.println(item + " out of stock");
            }
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }

    // Display stock
    void displayStock() {
        System.out.println("\nCurrent Stock:");
        for (String item : stockMap.keySet()) {
            System.out.println(item + " : " + stockMap.get(item));
        }
    }
}