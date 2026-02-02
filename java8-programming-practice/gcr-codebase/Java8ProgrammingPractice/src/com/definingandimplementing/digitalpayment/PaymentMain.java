package com.definingandimplementing.digitalpayment;

public class PaymentMain {
	public static void main(String[] args) {
		Payment upi = new UPIPayment();
		Payment card = new CreditCardPayment();
		Payment wallet = new WalletPayment();

		upi.pay(500);
		card.pay(1200);
		wallet.pay(300);
	}
}