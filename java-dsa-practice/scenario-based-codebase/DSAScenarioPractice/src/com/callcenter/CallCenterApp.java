package com.callcenter;

public class CallCenterApp {
    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.receiveCall("9876543210", false);
        center.receiveCall("9999999999", true);
        center.receiveCall("9876543210", false);
        center.receiveCall("8888888888", true);

        center.handleCall();
        center.handleCall();
        center.handleCall();

        center.displayCustomerStats();
    }
}