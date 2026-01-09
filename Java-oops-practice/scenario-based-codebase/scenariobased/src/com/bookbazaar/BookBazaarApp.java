package com.bookbazaar;

public class BookBazaarApp {

    public static void main(String[] args) {

        Book book1 = new EBook("Java Mastery", "James", 500, 10 );

        Order order = new Order(book1, 2);
        order.placeOrder();
    }
}
