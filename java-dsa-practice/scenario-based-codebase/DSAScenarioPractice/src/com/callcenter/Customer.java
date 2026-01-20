package com.callcenter;

class Customer {
    String phone;
    boolean isVIP;
    int callCount;

    Customer(String phone, boolean isVIP) {
        this.phone = phone;
        this.isVIP = isVIP;
        this.callCount = 1;
    }

    @Override
    public String toString() {
        return phone + (isVIP ? " [VIP]" : "");
    }
}