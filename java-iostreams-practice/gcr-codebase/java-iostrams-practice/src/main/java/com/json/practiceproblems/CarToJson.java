package com.json.practiceproblems;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CarToJson {

	// inner class
	static class Car {
		private String brand;
		private String model;
		private int price;

		public Car(String brand, String model, int price) {
			this.brand = brand;
			this.model = model;
			this.price = price;
		}

		public String getBrand() {
			return brand;
		}

		public String getModel() {
			return model;
		}

		public int getPrice() {
			return price;
		}

	}
	
	

	public static void main(String[] args) throws JsonProcessingException {

		// create java object
		Car car = new Car("Maruti", "Siera", 1300000);

		// convert java object to json
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(car);

		System.out.println(json);

	}

}