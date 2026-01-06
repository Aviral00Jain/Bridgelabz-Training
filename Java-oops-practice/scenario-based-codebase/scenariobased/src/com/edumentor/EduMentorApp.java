package com.edumentor;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner("Aditi", "aditi@gmail.com", 101);

        String[] questions = {"Java is OOP?", "Interface supports abstraction?"};
        String[] answers = {"Yes", "Yes"};

        Quiz quiz = new Quiz(questions, answers, "Medium");

        String[] userAnswers = {"Yes", "Yes"};
        quiz.evaluate(userAnswers);

        System.out.println("Quiz Percentage: " + quiz.getPercentage());

        ICertifiable course1 = new ShortCourse();
        ICertifiable course2 = new FullTimeCourse();

        course1.generateCertificate();   // Polymorphism
        course2.generateCertificate();
    }
}

