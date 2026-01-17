package com.vehiclerentalapplication;

public class Customer {
	private String customerName;
	protected int contactNumber;
	Customer(String customerName,int contactNumber ){
		this.customerName=customerName;
		this.contactNumber=contactNumber;
	}
	public Customer(String customerName2, String string) {
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void customerInfo() {
		System.out.println("Customer Name : "+ getCustomerName()+" Contact Number :"+getContactNumber());
	}

}
