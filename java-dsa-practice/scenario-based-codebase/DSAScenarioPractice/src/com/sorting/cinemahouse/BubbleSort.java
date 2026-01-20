package com.sorting.cinemahouse;

class BubbleSort {

    public static void bubbleSort(MovieShow[] shows) {
        int n = shows.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (shows[j].showTime > shows[j + 1].showTime) {
                    swap(shows, j, j + 1);
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    private static void swap(MovieShow[] arr, int i, int j) {
        MovieShow temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}