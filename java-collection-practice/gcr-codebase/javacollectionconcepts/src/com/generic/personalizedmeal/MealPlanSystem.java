package com.generic.personalizedmeal;

public class MealPlanSystem {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =
                new Meal<>(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =
                new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal =
                new Meal<>(new KetoMeal());

        //display 
        MealGenerator.generateMeal(vegMeal.getMealPlan());
        MealGenerator.generateMeal(veganMeal.getMealPlan());
        MealGenerator.generateMeal(ketoMeal.getMealPlan());
    }
}
