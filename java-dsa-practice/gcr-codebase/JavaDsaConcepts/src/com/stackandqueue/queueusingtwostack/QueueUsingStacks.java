package com.stackandqueue.queueusingtwostack;

import java.util.Stack;

import java.util.Stack;

class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>(); // enqueue stack
    Stack<Integer> stack2 = new Stack<>(); // dequeue stack

    // Enqueue operation
    void enqueue(int value) {
        stack1.push(value);
        System.out.println(value + " enqueued");
    }

    // Dequeue operation
    void dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        // Transfer only if stack2 is empty
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println(stack2.pop() + " dequeued");
    }

    // Peek operation
    void peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.println("Front element: " + stack2.peek());
    }
}
