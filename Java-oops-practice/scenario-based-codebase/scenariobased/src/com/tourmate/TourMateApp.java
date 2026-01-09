package com.tourmate;


public class TourMateApp {

    public static void main(String[] args) {

        Transport t = new Transport(5000);
        Hotel h = new Hotel(8000);
        Activity a = new Activity(2000);

        Trip trip1 = new DomesticTrip("Goa", 5, t, h, a);
        Trip trip2 = new InternationalTrip("Paris", 7, t, h, a);

        trip1.book();
        System.out.println("Budget: " + trip1.getBudget());

        trip2.book();
        System.out.println("Budget: " + trip2.getBudget());
    }
}
