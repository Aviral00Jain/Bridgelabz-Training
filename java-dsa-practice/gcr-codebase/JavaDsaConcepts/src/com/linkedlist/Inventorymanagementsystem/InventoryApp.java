package com.linkedlist.Inventorymanagementsystem;

public class InventoryApp {

    public static void main(String[] args) {

        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtEnd(101, "Laptop", 5, 55000);
        inventory.addAtEnd(102, "Mouse", 20, 500);
        inventory.addAtBeginning(103, "Keyboard", 10, 1500);
        inventory.addAtPosition(2, 104, "Monitor", 7, 12000);

        System.out.println("\nAll Items:");
        inventory.displayAll();

        System.out.println("\nSearch by ID:");
        inventory.searchById(102);

        System.out.println("\nUpdate Quantity:");
        inventory.updateQuantity(101, 8);

        System.out.println("\nTotal Inventory Value:");
        inventory.calculateTotalValue();

        System.out.println("\nSort by Name :");
        inventory.sortByName(true);
        inventory.displayAll();

        System.out.println("\nSort by Price :");
        inventory.sortByPrice(false);
        inventory.displayAll();

        System.out.println("\nRemove Item:");
        inventory.removeByItemId(104);
        inventory.displayAll();
    }
}