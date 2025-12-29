package com.constructor.levelone;

public class HotelBookingDriver {
    public static void main(String[] args) {

        // Default Booking
        HotelBooking b1 = new HotelBooking();

        // Parameterized Booking
        HotelBooking b2 = new HotelBooking("Aaditya Joshi", "Deluxe", 3);

        // Copy Booking
        HotelBooking b3 = new HotelBooking(b2);

        System.out.println("Default Booking:");
        b1.display();

        System.out.println("Parameterized Booking:");
        b2.display();

        System.out.println("Copied Booking:");
        b3.display();
        
    }
}