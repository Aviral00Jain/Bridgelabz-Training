package com.student.constructor.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.constructor.config.AppConfig;
import com.student.constructor.entity.Student;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student =
                context.getBean(Student.class);

        student.display();
    }
}