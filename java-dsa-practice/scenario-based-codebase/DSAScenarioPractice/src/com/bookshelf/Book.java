package com.bookshelf;

import java.util.*;

public class Book {
	String title;
	String author;
	String genre;
	
	Book(String title, String author, String genre){
		this.title = title;
		this.author = author;
		this.genre = genre;
	}

	public boolean equals(Object o) {
		if(this == o ) return true;
		if(!(o instanceof Book)) return false;
		Book book = (Book) o;
		return title.equals(book.title) && author.equals(book.author)
				&& genre.equals(book.genre);
		
	}
	
	public int hashCode() {
		return Objects.hash(title, author, genre);
	}
	
	public String toString() {
		return title +" by "+ author;
	}
}