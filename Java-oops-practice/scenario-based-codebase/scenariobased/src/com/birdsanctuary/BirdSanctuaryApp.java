package com.birdsanctuary;

import java.util.Scanner;

public class BirdSanctuaryApp {

	public static void main(String[] args) {
		SanctuaryManager manager = new SanctuaryManager();
		Scanner sc = new Scanner(System.in);

		int choice;
		do {
			System.out.println("\nWelcome to EcoWing Bird Sanctuary");
			System.out.println("1 Add Bird");
			System.out.println("2 display All Birds");
			System.out.println("3 display All Flying Birds");
			System.out.println("4 display All Swimming Birds");
			System.out.println("5 display Both Flying & Swimming Birds");
			System.out.println("6 delete Bird by ID");
			System.out.println("7 sanctuary Report");
			System.out.println("8 exit");

			System.out.print("enter your choice: ");
			choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {

			case 1:
				System.out.print("Enter Bird Name: ");
				String name = sc.nextLine();

				System.out.print("Enter Bird ID: ");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Species: ");
				String species = sc.nextLine();

				System.out.println("Select Bird Type:");
				System.out.println("1. eagle");
				System.out.println("2. Duck");
				System.out.println("3. Penguin");
				System.out.println("4. Seagull");
				System.out.println("5. Kiwi");
				System.out.println("6. Ostrich");

				int type = sc.nextInt();

				Bird bird = null;

				switch (type) {
				case 1:
					bird = new Eagle(name, id, species);
					break;
				case 2:
					bird = new Duck(name, id, species);
					break;
				case 3:
					bird = new Penguin(name, id, species);
					break;
				case 4:
					bird = new Seagull(name, id, species);
					break;
				case 5:
					bird = new Kiwi(name, id, species);
					break;
				case 6:
					bird = new Ostrich(name, id, species);
					break;
				default:
					System.out.println("Invalid bird type.");
				}

				if (bird != null) {
					manager.addBird(bird);
				}
				break;

			case 2:
				manager.displayAllBirds();
				break;

			case 3:
				manager.displayFlyingBirds();
				break;

			case 4:
				manager.displaySwimmingBirds();
				break;

			case 5:
				System.out.println("\n--- Birds that Fly & Swim ---");
				manager.displayFlyingAndSwimmingBirds();
				break;

			case 6:
				System.out.print("Enter Bird ID to delete: ");
				int deleteId = sc.nextInt();
				manager.removeBirdById(deleteId);
				break;

			case 7:
				manager.sanctuaryReport();
				break;
			case 8:
				System.out.println("Exiting EcoWing Bird Sanctuary. Goodbye!");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 8);
		sc.close();
	}
}