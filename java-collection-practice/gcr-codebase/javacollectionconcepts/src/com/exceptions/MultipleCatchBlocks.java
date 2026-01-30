package com.exceptions;
import java.util.Scanner;

//create a MultipleCatchBlock class that check using multiple catch block
public class MultipleCatchBlocks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = null;

        try {
            System.out.println("Enter the size of array:");
            int size = input.nextInt();
            array = new int[size];

            System.out.println("Enter array elements:");
            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            System.out.println("Enter index to retrieve value:");
            int index = input.nextInt();

            System.out.println("Value at index " + index + ": " + array[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
            

        } catch (NullPointerException e) {
            System.out.println("array is not initialized!");

        } finally {
        	
            input.close();
        }
    }
}