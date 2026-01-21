package com.generic.aidrivenresumescreening;
import java.util.List;
//create class ScreeningPipeline
class ScreeningPipeline {
    public static void processAll(List<? extends JobRole> candidates) {
        for (JobRole role : candidates) {
            role.evaluate();
        }
    }
}