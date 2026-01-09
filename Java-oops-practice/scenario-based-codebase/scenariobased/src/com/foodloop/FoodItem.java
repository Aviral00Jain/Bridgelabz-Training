package com.foodloop;

abstract class FoodItem {
    protected String name;
    protected String category;
    protected double price;

    // Encapsulation: stock hidden
    private int stock;

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    protected void reduceStock() {
        if (stock > 0) {
            stock--;
        }
    }

    public double getPrice() {
        return price;
    }
}
