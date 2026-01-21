package com.listinterface;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

public class ReverseList {
	public static void reverseList(List<Integer> list) {
		int start = 0;
		int end = list.size() -1;
		
		while(start < end) {
			int temp = list.get(start);
			list.set(start , list.get(end));
			list.set(end, temp);
			start++;
			end--;
		}
		
	}
	
	public static void reverseArrayList(List<Integer> list) {
		int start = 0;
		int end = list.size()-1;
		
		while(start < end) {
			int temp = list.get(start);
			list.set(start, list.get(end));
			list.set(end, temp);
			end--;
			start++;
		}
		
	}
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println("Print before reverse: ");
		System.out.println(list);
		reverseList(list);
		System.out.println("Print after reverse: ");
		System.out.println(list);
		
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		System.out.println("arraylist before reverse");
		System.out.println(arrayList);
		reverseArrayList(arrayList);
		System.out.println("arrayList after reverse");
		System.out.println(arrayList);
		
	}
}