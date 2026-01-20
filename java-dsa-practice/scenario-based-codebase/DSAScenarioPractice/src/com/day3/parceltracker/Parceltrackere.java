package com.day3.parceltracker;

public class Parceltrackere {

    private StageNode head;

    // Initialize default stages
    public Parceltrackere() {
        head = new StageNode("Packed");
        StageNode shipped = new StageNode("Shipped");
        StageNode transit = new StageNode("In Transit");
        StageNode delivered = new StageNode("Delivered");

        head.next = shipped;
        shipped.next = transit;
        transit.next = delivered;
    }

    // 🔹 Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel is missing!");
            return;
        }

        StageNode temp = head;
        System.out.println("Parcel Tracking Status:");

        while (temp != null) {
            System.out.print(temp.stage + " → ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // 🔹 Add intermediate checkpoint after a given stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stage.equals(afterStage)) {
                StageNode newNode = new StageNode(newStage);
                newNode.next = temp.next;
                temp.next = newNode;
                System.out.println("Checkpoint added: " + newStage);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Stage not found!");
    }

    // 🔹 Handle lost parcel (break chain)
    public void markParcelLost(String stageName) {
        StageNode temp = head;

        while (temp != null) {
            if (temp.stage.equals(stageName)) {
                temp.next = null;
                System.out.println("Parcel lost after stage: " + stageName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Stage not found!");
    }
}