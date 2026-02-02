package com.lambdaexpression.ecommerce;

// Product class represents items in the online shop
class Product {
	int id;
	String name;
	double price;
	double rating;
	double discount;

	// Constructor to initialize product details
	public Product(int id, String name, double price, double rating, double discount) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}

	// Overriding toString() to print product details clearly
	@Override
	public String toString() {
		return id + " | " + name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
	}
}