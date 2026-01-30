package com.exceptions;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter size of array:");
            int size = input.nextInt();

            int[] arr = new int[size];

            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                arr[i] = input.nextInt();
            }

            System.out.println("Enter index to access:");
            int index = input.nextInt();

            try {
                System.out.println("Enter divisor:");
                int divisor = input.nextInt();

                int result = arr[index] / divisor;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        input.close();
    }
}
