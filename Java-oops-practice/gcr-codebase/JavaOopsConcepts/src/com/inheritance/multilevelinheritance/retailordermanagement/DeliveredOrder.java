package com.inheritance.multilevelinheritance.retailordermanagement;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    DeliveredOrder(String orderId, String orderDate,
                   String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding method
    @Override
    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

