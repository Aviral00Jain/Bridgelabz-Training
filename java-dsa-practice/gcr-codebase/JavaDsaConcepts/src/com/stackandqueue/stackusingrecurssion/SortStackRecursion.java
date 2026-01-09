package com.stackandqueue.stackusingrecurssion;

import java.util.Stack;

public class SortStackRecursion {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Step 1: Pop top element
        int top = stack.pop();

        // Step 2: Sort remaining stack
        sortStack(stack);

        // Step 3: Insert element in sorted order
        insertSorted(stack, top);
    }

    // Helper function to insert element in sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {

        // Base case
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursive call
        insertSorted(stack, element);

        // Push back removed element
        stack.push(top);
    }

    // Driver code
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}