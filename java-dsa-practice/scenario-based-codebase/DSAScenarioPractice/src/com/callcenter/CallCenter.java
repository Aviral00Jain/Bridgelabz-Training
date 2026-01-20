package com.callcenter;

import java.util.*;

class CallCenter {

    private Queue<Customer> normalQueue = new LinkedList<>();

    private PriorityQueue<Customer> vipQueue =
            new PriorityQueue<>((a, b) -> b.callCount - a.callCount);

    private Map<String, Customer> customerMap = new HashMap<>();

    public void receiveCall(String phone, boolean isVIP) {

        Customer customer;

        if (customerMap.containsKey(phone)) {
            customer = customerMap.get(phone);
            customer.callCount++;
        } else {
            customer = new Customer(phone, isVIP);
            customerMap.put(phone, customer);
        }

        if (isVIP) {
            vipQueue.offer(customer);
            System.out.println("VIP call received: " + customer);
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal call received: " + customer);
        }
    }

    public void handleCall() {
        if (!vipQueue.isEmpty()) {
            Customer c = vipQueue.poll();
            System.out.println("Handling VIP call: " + c);
        } else if (!normalQueue.isEmpty()) {
            Customer c = normalQueue.poll();
            System.out.println("Handling normal call: " + c);
        } else {
            System.out.println("No calls to handle.");
        }
    }

    // Displaying customer call 
    public void displayCustomerStats() {
        System.out.println("\nCustomer call count:");
        for (Customer c : customerMap.values()) {
            System.out.println(c.phone + " → " + c.callCount + " calls");
        }
    }
}
