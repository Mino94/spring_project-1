package com.spring_mvc.book;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BookController {
	@Autowired
	BookService service;
	
	private static final Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@RequestMapping(value="/book/bookListView",method=RequestMethod.GET)
	public String viewBookList(Model model) {
		ArrayList<BookDTO> bList = service.bookList();
		model.addAttribute("bList",bList);
		return "book/bookListView";
	}
	
	@RequestMapping(value="/book/bookNewBook")
	public String viewBookForm() {
		return "book/bookNewBook";
	}
	
	@RequestMapping(value="/book/insert")
	public String insertBook(BookDTO bk) {
		service.insertBook(bk);
		return "redirect:./bookListView";
	}
	
	@RequestMapping(value="/book/bookDetailView/{bookNo}")
	public String detailViewBook(@PathVariable String bookNo, Model model) {
		BookDTO bk = service.bookDetailView(bookNo);
		model.addAttribute("bk",bk);
		return "book/bookDetailView";
	}
	
	@RequestMapping(value="/book/updateForm/{bookNo}")
	public String updateBookForm(@PathVariable String bookNo, Model model) {
		BookDTO bk = service.bookDetailView(bookNo);
		model.addAttribute("bk",bk);
		return "book/bookUpdateForm";
	}
	
	@RequestMapping(value="/book/update")
	public String updateBook(BookDTO bk) {
		service.updateBook(bk);
		return "redirect:./bookListView";
	}
	
	@RequestMapping(value="/book/delete/{bookNo}")
	public String deleteBook(@PathVariable String bookNo) {
		service.deleteBook(bookNo);
		return "redirect:/book/bookListView";
	}
}
