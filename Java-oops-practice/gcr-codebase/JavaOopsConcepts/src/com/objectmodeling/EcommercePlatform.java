package com.objectmodeling;

import java.util.ArrayList;

//class to represent a Product
class Product {
	//instance variables
	int productId;
	String productName;
	double price;

	//constructor to initialize product details
	Product(int productId, String productName, double price) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	//method to display product details
	void displayProduct() {
		System.out.println("Product ID: " + productId + 
						   ", Name: " + productName + 
						   ", Price: " + price);
	}
}

//class to represent an Order (aggregates Product objects)
class Order {
	//instance variables
	int orderId;
	ArrayList<Product> products = new ArrayList<Product>();

	//constructor to initialize order
	Order(int orderId) {
		this.orderId = orderId;
	}

	//method to add product to order
	void addProduct(Product product) {
		products.add(product);
	}

	//method to display order details
	void displayOrder() {
		System.out.println("Order ID: " + orderId);
		for (Product product : products) {
			product.displayProduct();
		}
	}
}

//class to represent a Customer
class Customer2 {
	//instance variables
	int customerId;
	String customerName;
	ArrayList<Order> orders = new ArrayList<Order>();

	//constructor to initialize customer details
	Customer2(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
	}

	//method to place an order (communication)
	void placeOrder(Order order) {
		orders.add(order);
		System.out.println("Customer " + customerName + 
						   " placed Order ID: " + order.orderId);
	}

	//method to display customer orders
	void displayOrders() {
		System.out.println("Customer Name: " + customerName);
		for (Order order : orders) {
			order.displayOrder();
			System.out.println();
		}
	}
}

public class EcommercePlatform {
	public static void main(String[] args) {

		//create products
		Product product1 = new Product(101, "Laptop", 55000);
		Product product2 = new Product(102, "Mouse", 500);
		Product product3 = new Product(103, "Keyboard", 1200);

		//create customer
		Customer2 customer = new Customer2(1, "Amit");

		//create order
		Order order1 = new Order(1001);

		//add products to order (aggregation)
		order1.addProduct(product1);
		order1.addProduct(product2);
		order1.addProduct(product3);

		System.out.println();

		//customer places order (association + communication)
		customer.placeOrder(order1);

		System.out.println();

		//display customer order details
		customer.displayOrders();
	}
}