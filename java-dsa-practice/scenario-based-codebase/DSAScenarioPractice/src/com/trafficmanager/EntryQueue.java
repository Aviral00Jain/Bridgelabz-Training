package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

class EntryQueue {

	private Queue<String> queue = new LinkedList<>();
	private int capacity;

	EntryQueue(int capacity) {
		this.capacity = capacity;
	}

	public void enqueue(String number) {
		if (queue.size() == capacity) {
			System.out.println("Queue Overflow! Vehicle waiting outside: " + number);
			return;
		}
		queue.offer(number);
		System.out.println("Vehicle queued: " + number);
	}

	public String dequeue() {
		if (queue.isEmpty()) {
			System.out.println("Queue Underflow! No vehicles waiting.");
			return null;
		}
		return queue.poll();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}
}