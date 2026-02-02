package com.definingandimplementing.multivehiclerental;

public class RentalMain {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle bike = new Bike();
		Vehicle bus = new Bus();

		car.rent();
		car.returnVehicle();

		bike.rent();
		bike.returnVehicle();

		bus.rent();
		bus.returnVehicle();
	}
}