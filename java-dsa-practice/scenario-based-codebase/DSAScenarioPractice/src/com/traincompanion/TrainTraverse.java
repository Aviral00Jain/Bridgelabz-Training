package com.traincompanion;

public class TrainTraverse {

	private TrainNode head;
	private TrainNode tail;
	private TrainNode current;

	public void addCompartment(int compartment, String service) {
		TrainNode newTrainNode = new TrainNode(compartment, service);

		if (head == null) {
			head = tail = current = newTrainNode;
		} else {
			tail.next = newTrainNode;
			newTrainNode.prev = tail;
			tail = newTrainNode;
		}
	}

	public void moveNext() {
		if (current != null && current.next != null) {
			current = current.next;
			displayCurrent();
		} else {
			System.out.println("You are at the last compartment");
		}
	}

	public void movePrevious() {
		if (current != null && current.prev != null) {
			current = current.prev;
			displayCurrent();
		} else {
			System.out.println("You are at the fist compartment");
		}
	}

	public void removeCompartment(int compartment) {
		TrainNode temp = head;

		while (temp != null) {
			if (temp.compartment == compartment) {

				if (temp.prev != null)
					temp.prev.next = temp.next;
				else
					head = temp.next;

				if (temp.next != null)
					temp.next.prev = temp.prev;
				else
					tail = temp.prev;

				if (current == temp)
					current = head;

				System.out.println(compartment + " removed from train.");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found.");

	}

	public void displayCurrent() {
		System.out.println("\nCurrent: " + current.compartment + " (" + current.service + ")");

		if (current.prev != null)
			System.out.println("Previous: " + current.prev.compartment);
		else
			System.out.println("Previous: None");

		if (current.next != null)
			System.out.println("Next: " + current.next.compartment);
		else
			System.out.println("Next: None");
	}
}