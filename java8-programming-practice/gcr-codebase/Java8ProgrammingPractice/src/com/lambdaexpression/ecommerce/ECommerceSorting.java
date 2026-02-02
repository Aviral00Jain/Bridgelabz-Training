package com.lambdaexpression.ecommerce;

import java.util.*;

public class ECommerceSorting {
	public static void main(String[] args) {
		// Creating product list
		List<Product> products = new ArrayList<>();

		// Adding products
		products.add(new Product(101, "Laptop", 55000, 4.5, 10));
		products.add(new Product(102, "Mobile", 25000, 4.7, 15));
		products.add(new Product(103, "Headphones", 2000, 4.2, 30));
		products.add(new Product(104, "Smart Watch", 8000, 4.4, 20));

		// Sort by Price (Low to High)
		products.sort((p1, p2) -> {
			return Double.compare(p1.price, p2.price);
		});

		System.out.println("Sorted by Price:");
		products.forEach(System.out::println);

		// Sort by Rating (High to Low)
		products.sort((p1, p2) -> {
			return Double.compare(p2.rating, p1.rating);
		});

		System.out.println("\nSorted by Rating:");
		products.forEach(System.out::println);

		// Sort by Discount (High to Low)
		products.sort((p1, p2) -> {
			return Double.compare(p2.discount, p1.discount);
		});

		System.out.println("\nSorted by Discount:");
		products.forEach(System.out::println);
	}
}