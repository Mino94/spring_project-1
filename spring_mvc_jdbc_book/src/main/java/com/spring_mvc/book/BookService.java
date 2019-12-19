package com.spring_mvc.book;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService implements IBookService {
	@Autowired
	BookDAO dao;
	
	@Override
	public ArrayList<BookDTO> bookList() {
		return dao.bookList();
	}
	
	@Override
	public void deleteBook(String bookNo) {
		dao.bookDelete(bookNo);
		
	}
	
	@Override
	public void insertBook(BookDTO bk) {
		dao.bookInsert(bk);
		
	}
	
	@Override
	public void updateBook(BookDTO bk) {
		dao.bookUpdate(bk);
		
	}
	
	@Override
	public BookDTO bookDetailView(String bookNo) {
		return dao.bookDetailView(bookNo);
	}
}
