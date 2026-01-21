package com.mapinterface;
import java.util.*;

// Create MergeMaps to merge two maps and sum values for duplicate keys
public class MergeMaps {

    public static void main(String[] args) {
        //first map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        // Second map
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        //merge maps
        Map<String, Integer> merged = mergeMaps(map1, map2);

        // Print result
        System.out.println(merged);
    }

    //method that merge two maps
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> merged = new HashMap<>(map1);
        for (Map.Entry<String, Integer> entry : map2.entrySet()) {
            merged.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return merged;
    }
}