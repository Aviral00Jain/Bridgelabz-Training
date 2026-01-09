package com.stringbuilder;

public class ReverseString {

    public static String reverseString(String input) {

        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "hello";
        String result = reverseString(str);

        System.out.println("Reversed String: " + result);
    }
}
