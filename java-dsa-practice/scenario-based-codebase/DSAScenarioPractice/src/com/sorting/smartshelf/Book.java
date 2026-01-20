package com.sorting.smartshelf;

import java.util.*;

public class Book {

	String name;
	
	Book(String name){
		this.name = name;
		
	}
	
	public String getTitle(){
		return name;
	}
	
	public String toString() {
		return name;
	}
}