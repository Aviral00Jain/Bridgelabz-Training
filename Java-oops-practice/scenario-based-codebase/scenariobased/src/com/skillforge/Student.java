package com.skillforge;

class Student extends User {

    private int progress; // percentage

    public Student(String name) {
        super(name);
        this.progress = 0;
    }

    // Operator usage: progress tracking
    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;
    }

    public int getProgress() {
        return progress;
    }
}
