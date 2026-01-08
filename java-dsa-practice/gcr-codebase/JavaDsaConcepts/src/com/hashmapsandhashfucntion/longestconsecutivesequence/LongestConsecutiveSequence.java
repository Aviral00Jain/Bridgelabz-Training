package com.hashmapsandhashfucntion.longestconsecutivesequence;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] arr) {

        HashSet<Integer> set = new HashSet<>();

        // store all elements
        for (int num : arr) {
            set.add(num);
        }

        int longest = 0;

        for (int num : arr) {

            // check if num is start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int count = 1;

                // count consecutive numbers
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] arr = {100, 4, 200, 1, 3, 2};

        System.out.println(longestConsecutive(arr));
    }
}
