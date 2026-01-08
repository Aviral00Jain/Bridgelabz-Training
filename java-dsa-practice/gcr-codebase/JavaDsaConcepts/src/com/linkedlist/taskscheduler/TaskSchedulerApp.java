package com.linkedlist.taskscheduler;

public class TaskSchedulerApp {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();

        scheduler.addAtEnd(1, "Design Module", "High", "10-Oct");
        scheduler.addAtEnd(2, "Write Code", "Medium", "12-Oct");
        scheduler.addAtBeginning(3, "Requirement Analysis", "High", "08-Oct");

        System.out.println("\nAll Tasks:");
        scheduler.displayAllTasks();

        System.out.println("\nView Current & Next:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nSearch High Priority:");
        scheduler.searchByPriority("High");

        System.out.println("\nRemove Task ID 2:");
        scheduler.removeByTaskId(2);

        System.out.println("\nFinal Task List:");
        scheduler.displayAllTasks();
    }
}