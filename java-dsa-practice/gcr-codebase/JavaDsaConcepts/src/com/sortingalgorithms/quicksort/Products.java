package com.sortingalgorithms.quicksort;

class Products {

    static void quickSort(double[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Sort left side
            quickSort(prices, low, pivotIndex - 1);

            // Sort right side
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    static int partition(double[] prices, int low, int high) {
        double pivot = prices[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                swap(prices, i, j);
            }
        }

        // Place pivot at correct position
        swap(prices, i + 1, high);
        return i + 1;
    }

    static void swap(double[] prices, int i, int j) {
        double temp = prices[i];
        prices[i] = prices[j];
        prices[j] = temp;
    }

    public static void main(String[] args) {
        double[] productPrices = {999.99, 249.50, 1499.00, 499.99, 799.25};

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (double price : productPrices) {
            System.out.print(price + " ");
        }
    }
}