package com.sorting.eventmanager;

public class Main {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(2500),
            new Ticket(1200),
            new Ticket(5000),
            new Ticket(800),
            new Ticket(3200),
            new Ticket(1500)
        };

        QuickSort.quickSort(tickets, 0, tickets.length - 1);

        System.out.println("Cheapest Tickets:");
        for (int i = 0; i < Math.min(3, tickets.length); i++) {
            System.out.println(tickets[i]);
        }

        System.out.println("\nMost Expensive Tickets:");
        for (int i = tickets.length - 1; i >= tickets.length - 3; i--) {
            System.out.println(tickets[i]);
        }
    }
}