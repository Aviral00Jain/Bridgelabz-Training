package com.setinterface;
import java.util.*;
//create SetToSortedList that Convert a Set to a Sorted List
public class SetToSortedList {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        //print output
        System.out.println(list);
    }
}