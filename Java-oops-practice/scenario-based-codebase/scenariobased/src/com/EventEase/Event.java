package com.EventEase;

abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;        // cannot be edited once assigned
    private double venueCost;
    private double serviceCost;
    private double discount;

    private static int idCounter = 1000;

    protected User organizer;

    // Constructor without extra services
    public Event(String eventName, String location, String date,
                 int attendees, double venueCost, User organizer) {

        this.eventId = ++idCounter;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
    }

    // Constructor with catering & decoration
    public Event(String eventName, String location, String date,
                 int attendees, double venueCost,
                 double serviceCost, double discount, User organizer) {

        this(eventName, location, date, attendees, venueCost, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println(eventName + " has been cancelled.");
    }

    abstract public void schedule();
}

