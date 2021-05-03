package com.callor.book.service.impl;

import java.util.List;

import com.callor.book.model.BookRentDTO;
import com.callor.book.model.BookRentVO;
import com.callor.book.service.BookRentService;

public class BookRentServiceImplV1 implements BookRentService{

	@Override
	public List<BookRentDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookRentDTO findById(Long seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRentDTO> findByBISBN(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRentDTO> findByBookName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRentDTO> findByBuyerCode(String bCode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRentDTO> findByBuyerName(String bName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRentDTO> findByOverDue(String eDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookRentDTO> findByTerm(String sDate, String eDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BookRentVO bookRentVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BookRentVO bookRentVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long seq) {
		// TODO Auto-generated method stub
		return 0;
	}

}
