package com.birdsanctuary;


import java.util.ArrayList;
import java.util.Iterator;

public class SanctuaryManager {

	private ArrayList<Bird> birds = new ArrayList<Bird>();
	
	// method to add bird
	public void addBird(Bird bird) {
		birds.add(bird);
		System.out.println("Bird added: " + bird.getName());
	}
	
	// display all birds
	public void displayAllBirds() {
		System.out.println("\n--- All Birds in Sanctuary ---");
		for (Bird bird : birds) {
			System.out.println("ID: " + bird.getId() + ", Name: " + bird.getName() + ", Species: " + bird.getSpecies());

			bird.eat();

			if (bird instanceof Flyable) {
				((Flyable) bird).fly();
			}
			if (bird instanceof Swimmable) {
				((Swimmable) bird).swim();
			}

			System.out.println();
		}
	}

	// method to display flying birds
	public void displayFlyingBirds() {
		System.out.println("\n--- Flying Birds ---");
		for (Bird bird : birds) {
			if (bird instanceof Flyable) {
				System.out.println(bird.getName());
			}
		}
	}
	
	// method to display swimming birds
	public void displaySwimmingBirds() {
		System.out.println("\n--- Swimming Birds ---");
		for (Bird b : birds) {
			if (b instanceof Swimmable) {
				System.out.println(b.getName());
			}
		}

	}
	
	// method to remove bird by id
	public void removeBirdById(int id) {
		Iterator<Bird> itr = birds.iterator();

		while (itr.hasNext()) {
			Bird b = itr.next();

			if (b.getId() == id) {
				itr.remove();
				System.out.println("Bird removed: " + b.getName());
				return;
			}
		}

		System.out.println("Bird not found with ID: " + id);
	}

	// display birds that can both fly and swim
	public void displayFlyingAndSwimmingBirds() {
		for (Bird b : birds) {
			if (b instanceof Flyable && b instanceof Swimmable) {
				System.out.println(b.getName());
			}
		}
	}

	//method to display sanctuary report
	public void sanctuaryReport() {
		int fly = 0, swim = 0, both = 0, neither = 0;

		for (Bird bird : birds) {
			boolean canFly = bird instanceof Flyable;
			boolean canSwim = bird instanceof Swimmable;

			if (canFly && canSwim) {
				both++;
			} else if (canFly) {
				fly++;
			} else if (canSwim) {
				swim++;
			} else {
				neither++;
			}
		}

		System.out.println("\n--- sanctuary Report ---");
		System.out.println("flyable Birds   : " + fly);
		System.out.println("Swimmable birds : " + swim);
		System.out.println("Both            : " + both);
		System.out.println("neither         : " + neither);
	}
}