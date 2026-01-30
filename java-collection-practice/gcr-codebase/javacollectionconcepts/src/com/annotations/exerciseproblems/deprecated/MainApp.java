package com.annotations.exerciseproblems.deprecated;

public class MainApp {

	public static void main(String[] args) {

		LegacyAPI api = new LegacyAPI();
		api.oldFeature(); 
		api.newFeature(); 
	}
}