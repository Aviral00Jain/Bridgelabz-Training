package com.defaultmethods.smartvehicle;

public class DashboardTest {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle ev = new ElectricCar();

		car.displaySpeed();
		car.displayBatteryStatus(); // default behavior

		System.out.println();

		ev.displaySpeed();
		ev.displayBatteryStatus(); // overridden behavior
	}
}