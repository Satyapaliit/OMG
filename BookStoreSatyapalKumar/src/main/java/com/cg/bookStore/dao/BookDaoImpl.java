package com.cg.bookStore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cg.bookStore.beans.Book;

@Transactional
@Component
public class BookDaoImpl implements IBookDao
{
	
	@PersistenceContext
	EntityManager entityManager;


	
	@Override
	public Book addBook(Book book)
	{
		Book temp=entityManager.find(Book.class,book.getBookId());
				entityManager.persist(book);
				entityManager.flush();
				return temp;
	}

}
