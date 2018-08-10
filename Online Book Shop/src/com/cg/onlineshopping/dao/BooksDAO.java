package com.cg.onlineshopping.dao;

import java.util.Collection;

import com.cg.onlineshopping.pojo.Books;

public interface BooksDAO {
	 void addNewBook(Books book);
	 Collection<Books> viewAllBooks();
	 Collection<Books> viewCart();
	 void deleteBooks(int itemId);
	 

}
