package com.encapsulationandpolymorphism.ecommerceplatform;

public class Groceries extends Product {

	
	// Constructor
	Groceries(int productId, String name, double price){
		super(productId, name, price);
	}
	
	// Abstract method
	public double calculateDiscount() {
		return getPrice() * 0.05;
	}

}
