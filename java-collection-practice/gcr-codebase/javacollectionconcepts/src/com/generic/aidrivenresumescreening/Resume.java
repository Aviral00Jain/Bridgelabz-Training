package com.generic.aidrivenresumescreening;
//create resume class

public class Resume<T extends JobRole> {
    private T jobRole;
    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }
}