package com.spring.khanhbn.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.khanhbn.dao.BookDao;
import com.spring.khanhbn.entities.Book;

@Service
public class BookServicesImpl implements BookServices {

	@Autowired
	BookDao bookDao;

	@Override
	@Transactional
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		bookDao.saveBook(book);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Book> listBooks() {
		// TODO Auto-generated method stub
		return bookDao.listBooks();
	}

	@Override
	@Transactional(readOnly = true)
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return bookDao.getBook(id);
	}

	@Override
	@Transactional
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookDao.deleteBook(id);
	}
	
}
