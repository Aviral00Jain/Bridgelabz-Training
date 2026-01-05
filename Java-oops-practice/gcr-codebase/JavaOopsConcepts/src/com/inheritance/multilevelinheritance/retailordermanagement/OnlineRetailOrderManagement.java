package com.inheritance.multilevelinheritance.retailordermanagement;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        Order order = new Order("ORD101", "01-01-2026");
        ShippedOrder shippedOrder =
                new ShippedOrder("ORD102", "02-01-2026", "TRK789");
        DeliveredOrder deliveredOrder =
                new DeliveredOrder("ORD103", "03-01-2026", "TRK456", "05-01-2026");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }}