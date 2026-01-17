package com.skillforge;

import java.util.ArrayList;
import java.util.List;

abstract class Course implements ICertifiable {

    protected String title;
    protected Instructor instructor;
    protected List<String> modules;

    private double rating;              // Encapsulation
    private final List<String> reviews; // Read-only externally

    // Constructor: default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    // Constructor: custom modules
    public Course(String title, Instructor instructor, List<String> modules) {
        this(title, instructor);
        this.modules = modules;
    }

    // Encapsulated rating logic
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = (rating + newRating) / 2;
        }
    }

    public double getRating() {
        return rating;
    }

    // Access Modifier rule: read-only reviews
    public List<String> getReviews() {
        return List.copyOf(reviews);
    }

    protected void addReview(String review) {
        reviews.add(review);
    }
}
