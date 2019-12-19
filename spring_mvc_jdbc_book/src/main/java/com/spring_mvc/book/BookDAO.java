package com.spring_mvc.book;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public ArrayList<BookDTO> bookList(){
		String sql = "select * from book order by bookNo";
		return (ArrayList<BookDTO>)jdbcTemplate.query(sql, new BeanPropertyRowMapper<BookDTO>(BookDTO.class));
	}
	
	public void bookInsert(BookDTO bk) {
		String sql = "insert into book values(?,?,?,?,?)";
		jdbcTemplate.update(sql,bk.getBookNo(),
								bk.getBookName(),
								bk.getBookPrice(),
								bk.getBookPublisher(),
								bk.getBookStock());
	}
	
	public BookDTO bookDetailView(String bookNo) {
		String sql = "select * from book where bookNo=?";
		return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<BookDTO>(BookDTO.class), bookNo);
	}
	
	public void bookUpdate(BookDTO bk) {
		String sql = "update book set bookName=?, bookPrice=?, bookPublisher=?, bookStock=? where bookNo=?";
		jdbcTemplate.update(sql,bk.getBookName(),
								bk.getBookPrice(),
								bk.getBookPublisher(),
								bk.getBookStock(),
								bk.getBookNo());
	}
	
	public void bookDelete(String bookNo) {
		String sql = "delete from book where bookNo=?";
		jdbcTemplate.update(sql,bookNo);
	}
}
