package com.stackandqueue.queueusingtwostack;

public class QueueUsingStacksMain {

    public static void main(String[] args) {

        QueueUsingStacks q = new QueueUsingStacks();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.peek();    // 10
        q.dequeue(); // 10
        q.dequeue(); // 20
        q.peek();    // 30
    }
}