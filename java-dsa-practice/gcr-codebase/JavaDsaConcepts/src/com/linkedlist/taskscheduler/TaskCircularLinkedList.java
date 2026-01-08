package com.linkedlist.taskscheduler;

class TaskCircularLinkedList {

    private TaskNode head;
    private TaskNode current;

    // Add at beginning
    public void addAtBeginning(int id, String name, String priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int id, String name, String priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int position, int id, String name, String priority, String dueDate) {

        if (position == 1) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;

        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    public void removeByTaskId(int id) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        // If only one node
        if (head.taskId == id && head.next == head) {
            head = current = null;
            System.out.println("Task removed");
            return;
        }

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task removed");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewNextTask() {

        if (current == null) {
            System.out.println("No tasks scheduled");
            return;
        }

        System.out.println(
                "Current Task → ID: " + current.taskId +
                        ", Name: " + current.taskName +
                        ", Priority: " + current.priority +
                        ", Due: " + current.dueDate
        );

        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {

        if (head == null) {
            System.out.println("No tasks to display");
            return;
        }

        TaskNode temp = head;

        do {
            System.out.println(
                    "ID: " + temp.taskId +
                            ", Name: " + temp.taskName +
                            ", Priority: " + temp.priority +
                            ", Due: " + temp.dueDate
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(String priority) {

        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority.equalsIgnoreCase(priority)) {
                System.out.println(
                        "ID: " + temp.taskId +
                                ", Name: " + temp.taskName +
                                ", Due: " + temp.dueDate
                );
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No task found with priority: " + priority);
        }
    }
}