package com.swiftcart;

class PerishableProduct extends Product {

    PerishableProduct(String name, double price, int quantity) {
        super(name, price, "Perishable", quantity);
    }

    @Override
    double getDiscount() {
        // Higher discount to clear stock
        return getTotalPrice() * 0.10; // 10%
    }
}
