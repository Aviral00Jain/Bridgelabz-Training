package com.bookbazaar;

public class EBook extends Book implements IDiscountable{

	EBook(String title, String author, double price, int stock){
		super(title, author, price, stock);
	}
	
	public double applyDiscount(double price) {
		return price * 0.90;
	}
}
