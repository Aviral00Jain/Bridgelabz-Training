package com.bookbazaar;

public class Order {
	
	private Book book;
	private int quantity;
	private double totalCost;
	
	protected String orderStatus;
	
	public Order(Book book, int quantity) {
		this.book = book;
		this.quantity = quantity;
		this.orderStatus = "Created";
	}
	
	public void placeOrder() {

        if (book.getStock() < quantity) {
            System.out.println("Order failed: insufficient stock");
            return;
        }

        IDiscountable discountableBook = (IDiscountable) book;

        double discountedPrice =
                discountableBook.applyDiscount(book.price);

        // Operators used here
        totalCost = discountedPrice * quantity;

        book.reduceStock(quantity);
        orderStatus = "PLACED";

        System.out.println("Order placed successfully!");
        System.out.println("Total cost: " + totalCost);
    }
	

}
