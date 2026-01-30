package com.reflection.basiclevel;

import java.lang.reflect.Constructor;

public class CreateObjectUsingReflection {

    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println("ID: " + id + ", Name: " + name);
        }
    }

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName(
                "com.reflection.basiclevel.CreateObjectUsingReflection$Student"
            );

            Constructor<?> constructor =
                cls.getDeclaredConstructor(int.class, String.class);

            Object obj = constructor.newInstance(101, "Keshav");

            Student student = (Student) obj;
            student.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}