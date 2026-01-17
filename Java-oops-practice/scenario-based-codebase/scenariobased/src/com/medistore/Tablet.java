package com.medistore;

public class Tablet extends Medicine {

    public Tablet(String name, double price, int expiryDays) {
        super(name, price, expiryDays);
    }

    @Override
    public boolean checkExpiry() {
        // Tablets last till expiryDays
        return getExpiryDays() <= 0;
    }
}
