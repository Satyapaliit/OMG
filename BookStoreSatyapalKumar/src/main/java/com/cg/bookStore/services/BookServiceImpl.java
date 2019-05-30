package com.cg.bookStore.services;

import com.cg.bookStore.beans.Book;
import com.cg.bookStore.dao.IBookDao;

public class BookServiceImpl implements IBookService
{
	IBookDao bookDao=null;

	@Override
	public Book addBook(Book book)
	{
		return bookDao.addBook(book);
	}

}
