package com.trafficmanager;

public class TrafficApp {
    public static void main(String[] args) {

        Roundabout roundabout = new Roundabout();
        EntryQueue entryQueue = new EntryQueue(3);

        entryQueue.enqueue("KA-01");
        entryQueue.enqueue("MP-09");
        entryQueue.enqueue("DL-12");
        entryQueue.enqueue("MH-20"); 

        while (!entryQueue.isEmpty()) {
            String v = entryQueue.dequeue();
            if (v != null)
                roundabout.addVehicle(v);
        }

        roundabout.display();

        roundabout.removeVehicle("MP-09");
        roundabout.display();

        roundabout.removeVehicle("KA-01");
        roundabout.display();
    }
}