package com.swiftcart;

class NonPerishableProduct extends Product {

    NonPerishableProduct(String name, double price, int quantity) {
        super(name, price, "Non-Perishable", quantity);
    }

    @Override
    double getDiscount() {
        return getTotalPrice() * 0.05; // 5%
    }
}
