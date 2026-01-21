package com.generic.smartwarehousemanagement;
import java.util.List;
import java.util.ArrayList;

public class Storage<T extends WarehouseItem> {
	private List<T> items = new ArrayList<>();
	// add items
	public void addItem(T item) {
		items.add(item);
	}
	//getter 
	public List<T> getItems(){
		return items;
	}
}