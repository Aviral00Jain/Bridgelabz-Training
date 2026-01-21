package com.generic.aidrivenresumescreening;
//create software engineer
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String name) {
        super(name);
    }
    @Override
    public void evaluate() {
        System.out.println(getCandidateName() + " evaluated for Software Engineer (DSA + System Design)");
    }
}