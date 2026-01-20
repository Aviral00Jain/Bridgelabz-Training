package com.day3.supermarket;

import java.util.HashMap;

class Customer {
    String name;
    HashMap<String, Integer> items; // item -> quantity

    Customer(String name) {
        this.name = name;
        this.items = new HashMap<>();
    }

    void addItem(String item, int quantity) {
        items.put(item, quantity);
    }
}