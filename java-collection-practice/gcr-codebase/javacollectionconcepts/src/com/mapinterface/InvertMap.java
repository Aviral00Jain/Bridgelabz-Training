package com.mapinterface;
import java.util.*;
//Create InvertMap to invert 
public class InvertMap {

    public static void main(String[] args) {

        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);
        Map<Integer, List<String>> inverted = invertMap(original);

        // Print result
        System.out.println(inverted);
    }

    //Method to invert a map
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> inverted = new HashMap<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();

            inverted.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        return inverted;
    }
}