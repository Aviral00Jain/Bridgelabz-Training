package com.fittrack;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // in minutes
    protected int caloriesBurned;

    // internal logs (not exposed)
    private String workoutLog;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories();

    @Override
    public void startWorkout() {
        workoutLog = "Workout started: " + type;
        System.out.println(workoutLog);
    }

    @Override
    public void stopWorkout() {
        System.out.println("Workout ended: " + type);
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }
}
