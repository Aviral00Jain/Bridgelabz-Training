package com.bookbazaar;

public class Book {
	
	protected  String title;
	protected  String author;
	protected double price;
	private int stock;
	
	
	Book(String title, String author, double price, int stock){
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	 public int getStock() {
		 return stock;
	 }
	 
	 public void reduceStock(int quantity) {
	        if (quantity <= stock) {
	            stock -= quantity;
	        } else {
	            System.out.println("Insufficient stock!");
	        }
	    }

	public double getPrice() {
		return price;
	}

}
