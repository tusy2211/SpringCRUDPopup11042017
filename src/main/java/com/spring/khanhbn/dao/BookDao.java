package com.spring.khanhbn.dao;

import java.util.List;

import com.spring.khanhbn.entities.Book;

public interface BookDao {
	public void saveBook(Book book);

	public List<Book> listBooks();

	public Book getBook(int id);

	public void deleteBook(int id);
}
