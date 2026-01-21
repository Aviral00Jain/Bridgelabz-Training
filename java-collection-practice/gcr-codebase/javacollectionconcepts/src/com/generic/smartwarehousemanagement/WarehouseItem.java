package com.generic.smartwarehousemanagement;

public abstract class WarehouseItem{
	private String name;
	
	public WarehouseItem(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	//every child class must implement this method
	public abstract void displayInfo();
}