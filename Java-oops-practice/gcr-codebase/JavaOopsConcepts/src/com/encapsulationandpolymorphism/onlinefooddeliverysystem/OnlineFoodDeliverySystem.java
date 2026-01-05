package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {

        List<FoodItem> orderItems = new ArrayList<>();

        orderItems.add(new VegItem("Paneer Butter Masala", 250, 2));
        orderItems.add(new NonVegItem("Chicken Biryani", 300, 1));

        OrderProcessor.processOrder(orderItems);
    }
}