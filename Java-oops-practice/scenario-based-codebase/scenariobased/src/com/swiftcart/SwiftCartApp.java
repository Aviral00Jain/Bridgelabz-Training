package com.swiftcart;

import java.util.ArrayList;

public class SwiftCartApp {

    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50, 2);
        Product rice = new NonPerishableProduct("Rice", 60, 5);

        ArrayList<Product> items = new ArrayList<>();
        items.add(milk);
        items.add(rice);

        Cart cart = new Cart(items);

        // Apply coupon discount
        cart.applyDiscount(50); // flat coupon

        cart.generateBill();
    }
}
