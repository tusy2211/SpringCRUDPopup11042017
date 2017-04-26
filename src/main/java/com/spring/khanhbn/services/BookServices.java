package com.spring.khanhbn.services;

import java.util.List;

import com.spring.khanhbn.entities.Book;

public interface BookServices {
	public void saveBook(Book book);

	public List<Book> listBooks();

	public Book getBook(int id);

	public void deleteBook(int id);
}
