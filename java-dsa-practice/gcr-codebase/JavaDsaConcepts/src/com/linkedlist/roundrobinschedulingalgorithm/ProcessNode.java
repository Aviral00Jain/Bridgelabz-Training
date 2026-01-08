package com.linkedlist.roundrobinschedulingalgorithm;

class ProcessNode {

    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime;
    int turnaroundTime;

    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}