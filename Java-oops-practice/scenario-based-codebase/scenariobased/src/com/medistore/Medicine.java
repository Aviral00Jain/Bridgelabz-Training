package com.medistore;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;     // sensitive
    private int expiryDays;   // simple integer
    protected int quantity;

    // Constructor with default quantity
    public Medicine(String name, double price, int expiryDays) {
        this(name, price, expiryDays, 50);
    }

    public Medicine(String name, double price, int expiryDays, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDays = expiryDays;
        this.quantity = quantity;
    }

    // Protected getter for subclasses
    protected int getExpiryDays() {
        return expiryDays;
    }

    protected double totalPrice(int qty) {
        return price * qty;
    }

    // Hidden pricing logic
    private double applyDiscount(double amount) {
        return amount * 0.95; // 5% discount
    }

    @Override
    public double sell(int qty) {
        if (checkExpiry()) {
            throw new IllegalStateException("Medicine expired!");
        }

        if (qty > quantity) {
            throw new IllegalArgumentException("Not enough stock!");
        }

        quantity -= qty;
        return applyDiscount(totalPrice(qty));
    }
}
