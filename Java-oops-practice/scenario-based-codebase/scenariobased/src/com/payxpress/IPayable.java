package com.payxpress;

public interface IPayable {
	void pay(boolean isLate);
	void sendReminder();
}
