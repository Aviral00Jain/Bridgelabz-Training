package com.queueinterface;
//Create CircularBuffer to simulate a fixed-size queue with overwrite when full
import java.util.*;
public class CircularBuffer {

    static class CircularQueue {
        private int[] buffer; 
        private int size;     
        private int front;    
        private int rear;     
        private int count;    
        // Constructor
        public CircularQueue(int size) {
            this.size = size;
            buffer = new int[size];
            front = 0;
            rear = 0;
            count = 0;
        }

        //insert element into buffer
        public void insert(int value) {
            buffer[rear] = value;        
            rear = (rear + 1) % size;   

            if (count < size) {
                count++;                 
            } else {
                front = (front + 1) % size; 
            }
        }

        public List<Integer> getBuffer() {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                int index = (front + i) % size;
                list.add(buffer[index]);
            }
            return list;
        }
    }
    public static void main(String[] args) {

        CircularQueue buffer = new CircularQueue(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);

        System.out.println("Buffer after 3 inserts: " + buffer.getBuffer());
        buffer.insert(4);
        System.out.println("Buffer after inserting 4: " + buffer.getBuffer());
    }
}