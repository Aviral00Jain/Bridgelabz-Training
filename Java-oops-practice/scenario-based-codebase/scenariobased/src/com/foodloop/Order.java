package com.foodloop;

import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Constructor: custom combo meal
    public Order(List<FoodItem> items) {
        this.items = items;
    }

    @Override
    public void placeOrder() {
        total = 0;
        for (FoodItem item : items) {
            if (item.isAvailable()) {
                total += item.getPrice(); // operator usage
                item.reduceStock();
            }
        }
        total -= applyDiscount(); // operator usage
        System.out.println("Order placed. Total = ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled");
    }

    // Polymorphism-ready method
    protected double applyDiscount() {
        if (total > 1000)
            return total * 0.15;
        else if (total > 500)
            return total * 0.10;
        else
            return 0;
    }
}
