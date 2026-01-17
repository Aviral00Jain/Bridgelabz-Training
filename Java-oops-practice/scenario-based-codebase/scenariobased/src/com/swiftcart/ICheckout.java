package com.swiftcart;

interface ICheckout {
    void generateBill();
    void applyDiscount(double couponAmount);
}
