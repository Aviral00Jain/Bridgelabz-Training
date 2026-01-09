package com.medistore;

public class Syrup extends Medicine {

    public Syrup(String name, double price, int expiryDays) {
        super(name, price, expiryDays);
    }

    @Override
    public boolean checkExpiry() {
        // Liquids expire earlier
        return getExpiryDays() <= 5;
    }
}
