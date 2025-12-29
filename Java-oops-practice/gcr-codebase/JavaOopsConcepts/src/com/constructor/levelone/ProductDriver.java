package com.constructor.levelone;

public class ProductDriver {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 30000);
        Product p3 = new Product("Headphones", 2500);

        System.out.println("Product Details:");
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();  // calling class method
        
    }
}