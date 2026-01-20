package com.sorting.smartshelf;

import java.util.*;

public class BookArrangement {
	
	private ArrayList<Book>  shelf = new ArrayList<>();
	
	  public void addBook(Book newBook) {
		  
		  int i = shelf.size()-1;
		  
		  while(i>= 0  && shelf.get(i).getTitle().compareToIgnoreCase(newBook.getTitle()) > 0) {
			  i--;
		  }
		  
		  shelf.add(i+1, newBook);
	  }
	  
	  public void displayShelf() {
		  for(Book books : shelf) {
			  System.out.println(books);
		  }
	  }

	  
}