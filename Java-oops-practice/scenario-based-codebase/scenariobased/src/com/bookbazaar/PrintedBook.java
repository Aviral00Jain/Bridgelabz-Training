package com.bookbazaar;

public class PrintedBook extends Book implements IDiscountable {
	
   PrintedBook(String title, String author, double price, int stock){
	   super(title, author, price, stock);
   }
   
    public double applyDiscount(double price){
    	return price * 0.95;
    }
}
