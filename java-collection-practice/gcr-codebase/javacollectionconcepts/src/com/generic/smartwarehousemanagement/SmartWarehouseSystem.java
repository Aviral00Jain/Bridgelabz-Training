package com.generic.smartwarehousemanagement;

public class SmartWarehouseSystem {
	public static void main(String[] args) {
		
		// create storages
		Storage<Electronics> electronicsStorage = new Storage<>();
		Storage<Groceries> groceriesStorage = new Storage<>();
		Storage<Furniture> furnitureStorage = new Storage<>();
		//add items
		electronicsStorage.addItem(new Electronics("Laptop", 2));
		electronicsStorage.addItem(new Electronics("Mobile", 1));
		groceriesStorage.addItem(new Groceries("Milk", "10-02-2026"));
		groceriesStorage.addItem(new Groceries("Rice", "01-12-2026"));
		furnitureStorage.addItem(new Furniture("Chair", "Wood"));
		furnitureStorage.addItem(new Furniture("Table", "Steel"));
		
		
		//print all items
		System.out.println("---electronics---");
		WarehouseUtility.displayAllItems(electronicsStorage.getItems());
		System.out.println("---Groceries---");
		WarehouseUtility.displayAllItems(groceriesStorage.getItems());
		System.out.println("---furniture---");
		WarehouseUtility.displayAllItems(furnitureStorage.getItems());
	}
}