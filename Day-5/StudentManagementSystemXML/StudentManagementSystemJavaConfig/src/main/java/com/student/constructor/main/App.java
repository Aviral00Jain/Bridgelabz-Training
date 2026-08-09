package com.student.constructor.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.constructor.config.AppConfig;
import com.student.constructor.entity.Student;

public class App {

    public static void main(String[] args) {

        // Load Spring IoC Container using Java Configuration
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Get Student Bean
        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);

        // Print Student Details
        System.out.println(student1);
        System.out.println(student2);

    }
}