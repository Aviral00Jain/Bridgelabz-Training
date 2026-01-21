package com.queueinterface;
import java.util.*;

//Create ReverseQueue that reverse elements of a queue
public class ReverseQueue {
    // method to reverse the queue using recursion
    public static void reverseQueue(Queue<Integer> queue) {
        //if queue is empty, return
        if (queue.isEmpty()) {
            return;
        }
        //  remove the front element
        int front = queue.remove();
        //Recursively reverse the remaining queue
        reverseQueue(queue);
        //  add the removed element back to the queue
        queue.add(front);
    }

    public static void main(String[] args) {
        // create a queue and add elements
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        //Print queue before reversing
        System.out.println("Before Reverse: " + queue);
        //reverse the queue
        reverseQueue(queue);
        //   Print queue after reversing
        System.out.println("After Reverse: " + queue);
    }
}