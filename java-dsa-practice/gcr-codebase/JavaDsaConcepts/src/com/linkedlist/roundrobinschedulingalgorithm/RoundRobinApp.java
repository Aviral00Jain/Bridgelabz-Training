package com.linkedlist.roundrobinschedulingalgorithm;

public class RoundRobinApp {

    public static void main(String[] args) {

        RoundRobinScheduler scheduler = new RoundRobinScheduler(3);

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);

        scheduler.schedule();
    }
}