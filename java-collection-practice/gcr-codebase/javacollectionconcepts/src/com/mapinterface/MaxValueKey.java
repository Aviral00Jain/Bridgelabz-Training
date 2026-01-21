package com.mapinterface;
import java.util.*;
// Create MaxValueKey to find the key with the highest value in a map
public class MaxValueKey {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);
        //find key with maximum value
        String maxKey = findMaxValueKey(map);

        // Print result
        System.out.println("Key with highest value: " + maxKey);
    }
    //method to find key with maximum value
    public static String findMaxValueKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
}