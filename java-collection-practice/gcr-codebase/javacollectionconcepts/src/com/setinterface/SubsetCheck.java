package com.setinterface;
import java.util.*;

//Create SubsetCheck to verify whether one set is a subset of another
public class SubsetCheck {

    public static void main(String[] args) {

        //create first set
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
        // create second set 
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        //   Check if set2 contains all elements of set1
        boolean isSubset = set2.containsAll(set1);

        // Print result
        System.out.println(isSubset);
    }
}