package com.fittrack;

public class FitTrackApp {

    public static void main(String[] args) {

        UserProfile user = new UserProfile(
                "Ayush",
                22,
                70.5,
                2500
        );

        Workout workout = new CardioWorkout(30); // polymorphism

        workout.startWorkout();
        workout.calculateCalories();
        workout.stopWorkout();

        int remainingCalories =
                user.getDailyCalorieGoal() - workout.getCaloriesBurned(); // operator

        System.out.println("Calories Burned: " + workout.getCaloriesBurned());
        System.out.println("Remaining Daily Calories: " + remainingCalories);
    }
}
