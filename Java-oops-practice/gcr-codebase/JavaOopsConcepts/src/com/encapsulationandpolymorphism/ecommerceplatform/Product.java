package com.encapsulationandpolymorphism.ecommerceplatform;

abstract class Product {
 
	
	//Attribute
	private int productId;
	private String name;
	private double price;
	
	//Constructor
	Product(int productId, String name, double price ){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	
	//Getter and Setter
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public int getProductId() {
		return productId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	//Method
	public abstract double calculateDiscount();
		
	
	public void displayProduct() {
	       System.out.println("Product: " + name);
	       System.out.println("Base Price: ₹" + price);
	   }
		
	}
