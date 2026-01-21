package com.listinterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

//Create RotateList class that rotate the elements by given positions
public class RotateList {
	public static void rotateLeft(List<Integer> list, int k) {
        int n = list.size();
        k = k % n;   

        for (int i = 0; i < k; i++) {
            int first = list.remove(0);
            list.add(first);
        }
    }
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter the number of rotation you want");
		int rotate = input.nextInt();
		List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
		rotateLeft(list , rotate);
		System.out.println(list);
	}
}