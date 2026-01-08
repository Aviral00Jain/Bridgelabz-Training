package com.linkedlist.roundrobinschedulingalgorithm;

class RoundRobinScheduler {

    private ProcessNode head;
    private ProcessNode tail;
    private int timeQuantum;
    private int currentTime = 0;
    private int completedProcesses = 0;
    private int totalWaitingTime = 0;
    private int totalTurnaroundTime = 0;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int id, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(id, burstTime, priority);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    // Remove process by ID
    private void removeProcess(ProcessNode prev, ProcessNode curr) {

        if (curr == head && curr == tail) {
            head = tail = null;
        }
        else if (curr == head) {
            head = head.next;
            tail.next = head;
        }
        else if (curr == tail) {
            prev.next = head;
            tail = prev;
        }
        else {
            prev.next = curr.next;
        }

        completedProcesses++;
    }

    // Simulate Round Robin Scheduling
    public void schedule() {

        if (head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        ProcessNode curr = head;
        ProcessNode prev = tail;

        while (head != null) {

            System.out.println("\nExecuting Process P" + curr.processId);

            if (curr.remainingTime > timeQuantum) {
                curr.remainingTime -= timeQuantum;
                currentTime += timeQuantum;
            } else {
                currentTime += curr.remainingTime;
                curr.remainingTime = 0;

                curr.turnaroundTime = currentTime;
                curr.waitingTime = curr.turnaroundTime - curr.burstTime;

                totalWaitingTime += curr.waitingTime;
                totalTurnaroundTime += curr.turnaroundTime;

                System.out.println("Process P" + curr.processId + " completed");
                removeProcess(prev, curr);
                curr = prev.next;
                displayQueue();
                continue;
            }

            displayQueue();
            prev = curr;
            curr = curr.next;
        }

        displayAverages();
    }

    // Display current circular queue
    private void displayQueue() {

        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        System.out.print("Current Queue: ");
        ProcessNode temp = head;

        do {
            System.out.print(
                    "[P" + temp.processId +
                            " RT:" + temp.remainingTime + "] -> "
            );
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    // Display average times
    private void displayAverages() {
        System.out.println("\n===== Scheduling Complete =====");
        System.out.println("Average Waiting Time: "
                + (double) totalWaitingTime / completedProcesses);
        System.out.println("Average Turnaround Time: "
                + (double) totalTurnaroundTime / completedProcesses);
    }
}