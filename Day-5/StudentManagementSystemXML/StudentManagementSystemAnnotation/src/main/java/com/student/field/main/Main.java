package com.student.field.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.student.field.config.AppConfig;
import com.student.field.entity.Student;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student student =
                context.getBean(Student.class);

        student.display();
    }
}