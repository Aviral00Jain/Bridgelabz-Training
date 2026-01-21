package com.generic.smartwarehousemanagement;
// class Electronics 
public class Electronics extends WarehouseItem{
	
	private int warrantyYears;
	
	public Electronics(String name , int warrantyYears) {
		super(name);
		this.warrantyYears = warrantyYears;
	}
	
	public void displayInfo() {
		System.out.println("Electronics " + getName() + ", Warranty "+ warrantyYears + " years");
	}
}