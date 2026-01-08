package com.hashmapsandhashfucntion.pairgivensum;

import java.util.HashMap;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {

            int needed = target - num;

            if (map.containsKey(needed)) {
                return true;   // pair found
            }

            map.put(num, true); // store visited number
        }

        return false; // no pair found
    }

    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        System.out.println(hasPair(arr, target));
    }
}
