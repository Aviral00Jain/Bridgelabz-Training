package com.linkedlist.Onlineticketreservationsystem;

public class TicketReservationApp {

    public static void main(String[] args) {

        TicketCircularList tickets = new TicketCircularList();

        tickets.addTicket(101, "Aman", "Inception", "A1", "10:00 AM");
        tickets.addTicket(102, "Riya", "Avatar", "B5", "10:05 AM");
        tickets.addTicket(103, "Karan", "Inception", "A2", "10:10 AM");

        System.out.println("\nAll Tickets:");
        tickets.displayTickets();

        System.out.println("\nSearch by Customer:");
        tickets.searchByCustomer("Aman");

        System.out.println("\nSearch by Movie:");
        tickets.searchByMovie("Inception");

        System.out.println("\nRemove Ticket ID 102:");
        tickets.removeTicket(102);

        System.out.println("\nRemaining Tickets:");
        tickets.displayTickets();

        System.out.println("\nTotal Tickets Booked: " +
                tickets.countTickets());
    }
}