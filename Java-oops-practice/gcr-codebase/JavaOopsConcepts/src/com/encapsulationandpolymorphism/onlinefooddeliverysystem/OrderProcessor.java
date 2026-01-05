package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

import java.util.List;

class OrderProcessor {

    public static void processOrder(List<FoodItem> items) {

        double grandTotal = 0;

        for (FoodItem item : items) {
            item.getItemDetails();

            double totalPrice = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = totalPrice - discount;
            grandTotal += finalPrice;

            System.out.println("Total Price: " + totalPrice);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }

        System.out.println("Grand Total Bill: " + grandTotal);
    }
}