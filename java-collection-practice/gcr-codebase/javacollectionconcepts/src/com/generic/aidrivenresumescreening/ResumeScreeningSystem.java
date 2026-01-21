package com.generic.aidrivenresumescreening;

import java.util.Arrays;
import java.util.List;
//Create ResumeScreeningSystem class
public class ResumeScreeningSystem {
    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>(new SoftwareEngineer("kesh"));
        Resume<DataScientist> r2 =
                new Resume<>(new DataScientist("a"));

        Resume<ProductManager> r3 =
                new Resume<>(new ProductManager("abda"));

        ResumeEvaluator.screenResume(r1);
        ResumeEvaluator.screenResume(r2);
        ResumeEvaluator.screenResume(r3);

        System.out.println("\nAi Screening Pipeline-");

        List<JobRole> allCandidates = Arrays.asList(
                new SoftwareEngineer("Kesh"),
                new DataScientist("a"),
                new ProductManager("abda")
        );

        ScreeningPipeline.processAll(allCandidates);
    }
}