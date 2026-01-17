package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatform {
 
	public static void main(String[] args) {
		
		Product p1 = new Electronics(101, "Laptop", 95000);
		Product p2 = new Clothing(102, "Shirt", 2500);
		Product p3 = new Groceries(103, "Vegetables", 500);
		
        List<Product> products = new ArrayList<>();
        
        products.add(p1);
        products.add(p2);
        products.add(p3);
        
        for (Product product : products) {

            product.displayProduct();
            
            double discount = product.calculateDiscount();
            double tax = 0;
            
            if (product instanceof Taxable) {
                Taxable taxable = (Taxable) product;
                tax = Taxable.calculateTax();
                System.out.println("Tax: " + tax);
                System.out.println(taxable.getTaxDetails());
            } else {
                System.out.println("Tax: 0");
            }

            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------");
        
            
        }
        

	}
}
