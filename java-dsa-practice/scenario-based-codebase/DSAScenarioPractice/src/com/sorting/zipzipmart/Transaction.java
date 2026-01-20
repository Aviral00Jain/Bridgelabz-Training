package com.sorting.zipzipmart;

public class Transaction {
	
	String date;
	double amount;
	
	Transaction(String date, double amount){
		this.date = date;
		this.amount = amount;
	}
	
	public String toString() {
		return date + " : amount : "+amount;
	}

}