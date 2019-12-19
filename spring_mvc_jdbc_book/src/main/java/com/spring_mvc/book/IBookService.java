package com.spring_mvc.book;

import java.util.ArrayList;

public interface IBookService {
	ArrayList<BookDTO> bookList();
	void insertBook(BookDTO bk);
	void updateBook(BookDTO bk);
	void deleteBook(String bookNo);
	BookDTO bookDetailView(String bookNo);
}
