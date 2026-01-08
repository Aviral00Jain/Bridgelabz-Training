package com.hashmapsandhashfucntion.subarrayswithzerosum;

import java.util.*;

public class ZeroSumSubarray {

    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, -4};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;

        // sum = 0 at index -1
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum)) {
                int startIndex = map.get(sum) + 1;
                System.out.println(
                        "Zero sum subarray from " + startIndex + " to " + i
                );
            } else {
                map.put(sum, i);
            }
        }
    }
}