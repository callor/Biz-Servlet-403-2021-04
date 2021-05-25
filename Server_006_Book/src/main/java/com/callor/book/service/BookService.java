package com.callor.book.service;

import java.util.List;

import com.callor.book.model.BookDTO;
import com.callor.book.model.BookVO;

public interface BookService {
	
	public List<BookDTO> selectAll();
	
	public BookDTO findById(String bk_isbn);
	public List<BookDTO> findByTitle(String bk_title);
	public List<BookDTO> findByCName(String bk_cname);
	public List<BookDTO> findByAName(String bk_aname);
	
	public int insert(BookVO bookVO);
	public int update(BookVO bookVO);
	public int delete(String bk_isbn);

}
