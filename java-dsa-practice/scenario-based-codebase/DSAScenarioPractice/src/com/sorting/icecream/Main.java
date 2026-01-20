package com.sorting.icecream;

public class Main {
    public static void main(String[] args) {

        IceCreamFlavor[] flavors = {
            new IceCreamFlavor("Vanilla", 120),
            new IceCreamFlavor("Chocolate", 200),
            new IceCreamFlavor("Strawberry", 90),
            new IceCreamFlavor("Mango", 160),};

        BubbleSort.bubbleSort(flavors);

        System.out.println("Flavors by Popularity:");
        for (IceCreamFlavor f : flavors) {
            System.out.println(f);
        }
    }
}