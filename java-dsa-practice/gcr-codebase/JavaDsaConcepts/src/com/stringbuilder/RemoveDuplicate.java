package com.stringbuilder;

import java.util.HashSet;

public class RemoveDuplicate {

    public static String removeDuplicates(String input) {

        StringBuilder sb = new StringBuilder(); // result
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "programming";
        String result = removeDuplicates(str);

        System.out.println("After removing duplicates: " + result);
    }
}
