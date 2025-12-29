package com.constructor.levelone;

public class Product {
    private String productName;
    private double price;

    // Class Variable (static)
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;   // increase count whenever product object is created
    }

    // Instance Method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("--------------------------------");
    }

    // Class Method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
        System.out.println("--------------------------------");
        
    }
}