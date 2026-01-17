package com.swiftcart;

abstract class Product {

    protected String name;
    protected double price;
    protected String category;
    protected int quantity;

    Product(String name, double price, String category, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
    }

    // Polymorphic discount method
    abstract double getDiscount();

    double getTotalPrice() {
        return price * quantity; // operator usage
    }
}
