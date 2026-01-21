package com.generic.aidrivenresumescreening;

//craete DataScientist class 
class DataScientist extends JobRole {
    public DataScientist(String name) {
        super(name);
    }
    @Override
    public void evaluate() {
        System.out.println(getCandidateName() + " evaluated for Data Scientist (ML + Statistics)");
    }
}