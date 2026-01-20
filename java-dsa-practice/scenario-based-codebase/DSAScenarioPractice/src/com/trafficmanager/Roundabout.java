package com.trafficmanager;

class Roundabout {

	private Vehicle head = null;
	private Vehicle tail = null;

	public void addVehicle(String number) {
		Vehicle newVehicle = new Vehicle(number);

		if (head == null) {
			head = tail = newVehicle;
			tail.next = head; // circular link
		} else {
			tail.next = newVehicle;
			tail = newVehicle;
			tail.next = head;
		}
		System.out.println("Vehicle entered roundabout: " + number);
	}

	public void removeVehicle(String number) {
		if (head == null) {
			System.out.println("Roundabout empty!");
			return;
		}

		Vehicle curr = head;
		Vehicle prev = tail;

		do {
			if (curr.number.equals(number)) {

				if (curr == head && curr == tail) {
					head = tail = null;
				} else if (curr == head) {
					head = head.next;
					tail.next = head;
				} else if (curr == tail) {
					tail = prev;
					tail.next = head;
				} else {
					prev.next = curr.next;
				}

				System.out.println("Vehicle exited roundabout: " + number);
				return;
			}
			prev = curr;
			curr = curr.next;
		} while (curr != head);

		System.out.println("Vehicle not found in roundabout.");
	}

	public void display() {
		if (head == null) {
			System.out.println("Roundabout is empty.");
			return;
		}

		System.out.print("Roundabout vehicles: ");
		Vehicle temp = head;
		do {
			System.out.print(temp.number + " -> ");
			temp = temp.next;
		} while (temp != head);
		System.out.println("(back to start)");
	}

	public boolean isEmpty() {
		return head == null;
	}
}