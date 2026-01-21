package com.generic.aidrivenresumescreening;

public class ResumeEvaluator {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        resume.getJobRole().evaluate();
    }
}
