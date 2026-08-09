package com.student.setter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.student.setter.entity.Student;

@Configuration
public class AppConfig {

    @Bean
    public Student student1() {

        Student student = new Student();

        student.setRollNo(101);
        student.setName("Saksham Jain");
        student.setCourse("Java Full Stack");
        student.setFees(45000);

        return student;
    }

    @Bean
    public Student student2() {

        Student student = new Student();

        student.setRollNo(102);
        student.setName("Aviral Jain");
        student.setCourse("Spring Boot");
        student.setFees(47000);

        return student;
    }
}