package com.encapsulationandpolymorphism.ecommerceplatform;

public class Clothing extends Product implements Taxable{
	
	Clothing(int productId, String name, double price){
		super(productId, name , price);
	}
	
	// Abstract method
	public double calculateDiscount(){
		return getPrice() * 0.20;
	}
	
	// Interface method
	public double calculateTax(double tax) {
		return getPrice() * 0.05; // 5% tax
	}
	
	public String getTaxDetails(){
		return "5 % discount on clothings";
	}

	
	



}
