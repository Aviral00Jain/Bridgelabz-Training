package com.fittrack;

public class UserProfile {
	
	private String name;
	private int age;
	private double weight;
	private int dailyCalorieGoal;
	
	UserProfile(String name, int age, double weight, int goal){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyCalorieGoal = goal;
	}
	
	UserProfile(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyCalorieGoal = 2000;
	}

	public double getWeight() {
        return weight;
    }

    public int getDailyCalorieGoal() {
        return dailyCalorieGoal;
    }
	

}
