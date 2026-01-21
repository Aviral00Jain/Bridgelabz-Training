package com.generic.smartwarehousemanagement;

public class Groceries extends WarehouseItem{
	private String expiryDate;
	
	public Groceries(String name , String expiryDate) {
		super(name);
		this.expiryDate = expiryDate;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Grocery: "+ getName() +", Expiry: "+expiryDate);
	}
}