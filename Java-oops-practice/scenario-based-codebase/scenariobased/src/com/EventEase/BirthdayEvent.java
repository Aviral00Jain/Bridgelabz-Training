package com.EventEase;

class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date,int attendees, double venueCost,double serviceCost, User organizer) {

        super(name, location, date, attendees, venueCost, serviceCost, 500, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday Event Scheduled 🎂");
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}

