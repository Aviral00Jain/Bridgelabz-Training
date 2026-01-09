package com.EventEase;

class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees, double venueCost, double serviceCost, User organizer) {

        super(name, location, date, attendees, venueCost, serviceCost, 1000, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("Conference Event Scheduled 🏢");
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}

