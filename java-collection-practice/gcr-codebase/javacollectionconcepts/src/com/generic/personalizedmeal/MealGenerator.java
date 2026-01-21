package com.generic.personalizedmeal;
//Create MealGenerator
public class MealGenerator {
	
    public static <T extends MealPlan> void generateMeal(T meal) {
        System.out.println("Generating personalized meal plan...");
        meal.showPlan();
    }
}