package com.listinterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//create a frequencyElement class that print frequency of element element
public class FrequencyElements {
	public static void main(String[] args) {
		
		//create object of scanner
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of element: ");
		int size = input.nextInt();
		//create hashmap 
		Map<String , Integer> map = new HashMap<>();
		for(int i = 0 ; i < size ; i++) {
			System.out.println("enter the number of fruit");
			String inputString = input.next();
			map.put(inputString, map.getOrDefault( inputString , 0)+1);
		}
		
		//display output
		for(Map.Entry<String , Integer> hmap : map.entrySet()) {
			System.out.print(hmap.getKey() + " " + hmap.getValue() + " ");
		}
	}
}