package com.stringbuffer;

public class StringConcatenation {

    public static String concatenateStrings(String[] arr) {

        StringBuffer sb = new StringBuffer(); // Step 1

        for (int i = 0; i < arr.length; i++) { // Step 2
            sb.append(arr[i]);
        }

        return sb.toString(); // Step 3
    }

    public static void main(String[] args) {

        String[] words = {"Hello", " ", "World ", "this ", "is ", "java."};

        String result = concatenateStrings(words);
        System.out.println(result);
    }
}