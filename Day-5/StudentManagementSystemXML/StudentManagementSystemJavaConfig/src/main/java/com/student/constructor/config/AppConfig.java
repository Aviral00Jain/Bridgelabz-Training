package com.student.constructor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.student.constructor.entity.Student;

@Configuration
public class AppConfig {

    @Bean
    public Student student1() {

        return new Student(
                101,
                "Saksham Jain",
                "Java Full Stack",
                45000
        );
    }
    @Bean
    public Student student2() {

        return new Student(
                102,
                "Aviral Jain",
                "Java Full Stack",
                47000
        );
    }
}