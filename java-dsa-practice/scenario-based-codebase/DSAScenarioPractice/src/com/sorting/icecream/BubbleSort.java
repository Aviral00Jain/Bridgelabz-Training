package com.sorting.icecream;

class BubbleSort {

    public static void bubbleSort(IceCreamFlavor[] flavors) {
        int n = flavors.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (flavors[j].salesCount < flavors[j + 1].salesCount) {
                    swap(flavors, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    private static void swap(IceCreamFlavor[] arr, int i, int j) {
        IceCreamFlavor temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}