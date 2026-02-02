package com.defaultmethods.paymentgateway;


public class PaymentGatewayTest {
	public static void main(String[] args) {
		PaymentProcessor upi = new UPIProcessor();
		PaymentProcessor card = new CreditCardProcessor();

		upi.pay(1000);
		upi.refund(200); // default method

		card.pay(2500);
		card.refund(500); // default method
	}
}