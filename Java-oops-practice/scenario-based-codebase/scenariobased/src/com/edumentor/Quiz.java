package com.edumentor;

class Quiz {
    private String[] questions;        // private question bank
    private final String[] answers;    // answers cannot be modified
    private int score;
    private String difficulty;

    // Constructor with difficulty
    public Quiz(String[] questions, String[] answers, String difficulty) {
        this.questions = questions;
        this.answers = answers;
        this.difficulty = difficulty;
    }

    public void evaluate(String[] userAnswers) {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(userAnswers[i])) {
                score++;   // operator usage
            }
        }
    }

    public double getPercentage() {
        return (score * 100.0) / answers.length;
    }
}

