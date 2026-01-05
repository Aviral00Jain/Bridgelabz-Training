package com.inheritance.multilevelinheritance.retailordermanagement;

class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    String getOrderStatus() {
        return "Order Placed";
    }
}
