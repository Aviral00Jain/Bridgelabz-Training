package com.edumentor;

class FullTimeCourse implements ICertifiable {
    @Override
    public void generateCertificate() {
        System.out.println("Full-Time Course Certificate Generated with Grade");
    }
}

