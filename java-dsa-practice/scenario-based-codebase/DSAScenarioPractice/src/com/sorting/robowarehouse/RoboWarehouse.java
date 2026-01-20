package com.sorting.robowarehouse;

import java.util.ArrayList;

class RoboWarehouse {

    private ArrayList<PackageItem> shelf = new ArrayList<>();

    public void addPackage(PackageItem newPackage) {

        int i = shelf.size() - 1;

        while (i >= 0 && shelf.get(i).weight > newPackage.weight) {
            i--;
        }

        shelf.add(i + 1, newPackage);
    }

    public void displayShelf() {
        for (PackageItem p : shelf) {
            System.out.print(p + "  ");
        }
        System.out.println();
    }
}