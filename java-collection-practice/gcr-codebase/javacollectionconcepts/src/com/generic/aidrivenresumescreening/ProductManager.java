package com.generic.aidrivenresumescreening;
//create ProductManager
class ProductManager extends JobRole {
    public ProductManager(String name) {
        super(name);
    }
    @Override
    public void evaluate() {
        System.out.println(getCandidateName() + " evaluated for product Manager ");
    }
}