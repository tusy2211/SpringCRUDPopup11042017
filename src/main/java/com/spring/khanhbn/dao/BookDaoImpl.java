package com.spring.khanhbn.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.khanhbn.entities.Book;

@Repository
public class BookDaoImpl implements BookDao {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		getSession().merge(book);
	}

	
	@Override
	public List<Book> listBooks() {
		// TODO Auto-generated method stub
		return getSession().createCriteria(Book.class).list();
	}

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return (Book) getSession().get(Book.class, id);
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		Book book = getBook(id);

		if (null != book) {
			getSession().delete(book);
		}
	}
	
	private Session getSession() {
		Session sess = getSessionFactory().getCurrentSession();
		if (sess == null) {
			sess = getSessionFactory().openSession();
		}
		return sess;
	}
	
	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
