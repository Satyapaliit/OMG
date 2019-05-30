package com.cg.bookStore.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cg.bookStore.beans.Book;

@Transactional
@Component
public interface IBookService
{
	public Book addBook(Book book);
}
