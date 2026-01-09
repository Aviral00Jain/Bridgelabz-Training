package com.EventEase;

public class EventEaseApp {

    public static void main(String[] args) {

        User user1 = new User("Aaditya", "aaditya@email.com");

        Event birthday = new BirthdayEvent(
                "Riya's Birthday", "Banquet Hall", "15-May-2026",
                50, 20000, 8000, user1);

        Event conference = new ConferenceEvent(
                "Tech Conference", "Convention Center", "20-June-2026",
                200, 50000, 20000, user1);

        birthday.schedule();
        birthday.reschedule("16-May-2026");

        System.out.println();

        conference.schedule();
        conference.cancel();
    }
}

