package com.medistore;

public class Injection extends Medicine {

    public Injection(String name, double price, int expiryDays, int quantity) {
        super(name, price, expiryDays, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Very sensitive
        return getExpiryDays() <= 10;
    }
}
