package com.definingandimplementing.digitalpayment;

public class UPIPayment implements Payment {
	@Override
	public void pay(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI");
	}
}