package com.swiftcart;

import java.util.ArrayList;

class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice; // protected by encapsulation

    // Empty cart constructor
    Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Pre-filled cart constructor
    Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getTotalPrice();
        }
    }

    void addProduct(Product product) {
        products.add(product);
        calculateTotal();
    }

    @Override
    public void applyDiscount(double couponAmount) {
        double productDiscount = 0;

        for (Product p : products) {
            productDiscount += p.getDiscount(); // polymorphism
        }

        totalPrice = totalPrice - productDiscount - couponAmount;
    }

    @Override
    public void generateBill() {
        System.out.println("\n--- SwiftCart Bill ---");
        for (Product p : products) {
            System.out.println(
                    p.name + "  Qty: " + p.quantity +
                    "  Price: " + p.getTotalPrice()
            );
        }
        System.out.println("Final Payable Amount: " + totalPrice);
    }
}
