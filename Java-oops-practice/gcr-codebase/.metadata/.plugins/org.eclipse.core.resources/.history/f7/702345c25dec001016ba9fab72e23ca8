package com.linkedlist.Onlineticketreservationsystem;

class TicketCircularList {

    private TicketNode head;
    private TicketNode tail;

    // Add ticket at end
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode =
                new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Remove ticket by ID
    public void removeTicket(int id) {

        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        // Only one ticket
        if (head.ticketId == id && head.next == head) {
            head = tail = null;
            System.out.println("Ticket removed");
            return;
        }

        TicketNode curr = head;
        TicketNode prev = tail;

        do {
            if (curr.ticketId == id) {

                if (curr == head) {
                    head = head.next;
                    tail.next = head;
                } else if (curr == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = curr.next;
                }

                System.out.println("Ticket removed");
                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != head);

        System.out.println("Ticket not found");
    }

    // Display all tickets
    public void displayTickets() {

        if (head == null) {
            System.out.println("No tickets to display");
            return;
        }

        TicketNode temp = head;
        do {
            displayTicket(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer name
    public void searchByCustomer(String name) {
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(name)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for customer: " + name);
        }
    }

    // Search by movie name
    public void searchByMovie(String movie) {
        if (head == null) {
            System.out.println("No tickets available");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movie)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for movie: " + movie);
        }
    }

    // Count total tickets
    public int countTickets() {

        if (head == null) return 0;

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }

    private void displayTicket(TicketNode t) {
        System.out.println(
                "TicketID: " + t.ticketId +
                        ", Customer: " + t.customerName +
                        ", Movie: " + t.movieName +
                        ", Seat: " + t.seatNumber +
                        ", Time: " + t.bookingTime
        );
    }
}