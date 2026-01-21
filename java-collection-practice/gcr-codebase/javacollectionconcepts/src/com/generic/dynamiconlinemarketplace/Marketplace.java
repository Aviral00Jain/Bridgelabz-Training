package com.generic.dynamiconlinemarketplace;

public class Marketplace {
	public static void main(String[] args) {
		
		Product<String> book = new Product<>("java book", 1500 , "education");
		Product<String> shirt = new Product<>("T-shirt", 1000 , "men clothing");
		Product<String> mobile = new Product<>("Smartphone", 400000, "Gadget");
		
		DiscountUtil.applyDiscount(book, 16);
		DiscountUtil.applyDiscount(shirt, 33);
		DiscountUtil.applyDiscount(mobile , 8);
		
		book.display();
		shirt.display();
		mobile.display();
	}
}