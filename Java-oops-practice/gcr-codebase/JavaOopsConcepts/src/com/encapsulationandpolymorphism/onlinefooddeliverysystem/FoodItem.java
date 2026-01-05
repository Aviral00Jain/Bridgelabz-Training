package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public abstract class FoodItem {
    private String itemName;
    protected double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation – controlled access
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0)
            this.quantity = quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}