package com.day3.parceltracker;

public class Main {
    public static void main(String[] args) {

        Parceltrackere tracker = new Parceltrackere();

        // Normal tracking
        tracker.trackParcel();

        // Add custom checkpoint
        tracker.addCheckpoint("Shipped", "Customs Clearance");
        tracker.trackParcel();

        // Parcel lost after transit
        tracker.markParcelLost("In Transit");
        tracker.trackParcel();
    }
}