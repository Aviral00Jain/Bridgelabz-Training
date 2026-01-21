package com.listinterface;

import java.util.*;
//create RemoveDuplicates class that remove the duplicates
public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        List<Integer> result = removeDuplicates(list);
        System.out.println(result);
    }
}