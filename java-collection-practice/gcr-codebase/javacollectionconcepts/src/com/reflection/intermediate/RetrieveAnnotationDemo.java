package com.reflection.intermediate;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Annotation;

public class RetrieveAnnotationDemo {
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.TYPE)
	@interface Author {
		String name();
	}

	@Author(name = "Author Name")
	static class Book {
	}

	public static void main(String[] args) {

		Class<Book> cls = Book.class;

		if (cls.isAnnotationPresent(Author.class)) {
			Author author = cls.getAnnotation(Author.class);
			System.out.println("Author Name: " + author.name());
		} else {
			System.out.println("Author annotation not found");
		}
	}
}