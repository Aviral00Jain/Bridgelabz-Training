package com.generic.smartwarehousemanagement;

public class Furniture extends WarehouseItem{
	private String material;
	
	public Furniture(String name , String material) {
		super(name);
		this.material = material;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("Furniture "+ getName() + ", Material " + material);
	}
}