package com.encapsulationandpolymorphism.ecommerceplatform;

public class Electronics extends Product implements Taxable{
	
		
	// Constructor
	Electronics(int productId, String name, double price){
		super(productId, name, price);
	}

	
	// Abstract method
	public double calculateDiscount() {
		return getPrice() * 0.10;
	}
	
	
	// Interface method
	@Override
	public double calculateTax() {
	    return getPrice() * 0.18;
	}

	public String getTaxDetails() {
		return "18% gst on electronics";
	}

}
