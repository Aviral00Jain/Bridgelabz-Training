package com.encapsulationandpolymorphism.librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book(101, "Clean Code", "Robert C. Martin"));
        libraryItems.add(new Magazine(102, "Time", "Time Editors"));
        libraryItems.add(new DVD(103, "Interstellar", "Christopher Nolan"));

        for (LibraryItem item : libraryItems) {
            item.getItemDetails();

            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("Yashraj");
            }

            System.out.println("---------------------------");
        }
    }
}