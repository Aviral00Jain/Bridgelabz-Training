package com.searching.binarysearch;

public class PeakElement {

    public static int findPeak(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int n = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                    (mid == n - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }

            // If left neighbor is greater, move left
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            }
            // Else move right
            else {
                left = mid + 1;
            }
        }
        return -1; // never reached
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int index = findPeak(arr);
        System.out.println("Peak index: " + index);
        System.out.println("Peak element: " + arr[index]);
    }
}