package com.listinterface;
import java.util.*;

public class NthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (n <= 0 || n > list.size()) {
            throw new IllegalArgumentException("Invalid N");
        }

        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();
        for (int i = 0; i < n; i++) {
            fast.next();
        }
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(findNthFromEnd(list, 2));
    }
}