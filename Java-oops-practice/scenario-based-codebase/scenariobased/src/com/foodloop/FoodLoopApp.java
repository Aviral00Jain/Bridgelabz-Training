package com.foodloop;

import java.util.Arrays;

public class FoodLoopApp {
    public static void main(String[] args) {

        FoodItem pizza = new VegItem("Margherita Pizza", 400, 5);
        FoodItem burger = new NonVegItem("Chicken Burger", 300, 3);
        FoodItem pasta = new VegItem("White Sauce Pasta", 350, 2);

        Order comboOrder = new Order(
                Arrays.asList(pizza, burger, pasta)
        );

        comboOrder.placeOrder();
    }
}
