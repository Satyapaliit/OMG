package com.cg.bookStore.dao;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cg.bookStore.beans.Book;

@Transactional
@Component
public interface IBookDao
{
	public Book addBook(Book book);

}
