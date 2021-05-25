package com.callor.book.service;

import java.util.List;

import com.callor.book.model.BookRentDTO;
import com.callor.book.model.BookRentVO;

// book_rent table의 CRUD를 구현하기 위한 인터페이스 선언
public interface BookRentService {
	
	public List<BookRentDTO> selectAll();
	
	// PK값으로 조회하기
	public BookRentDTO findById(Long seq);
	
	// 도서코드로 대여목록 조회
	public List<BookRentDTO> findByBISBN(String isbn);
	
	// 도서명으로 대여목록 조회
	public List<BookRentDTO> findByBookName(String name);
	
	// 회원코드로 대여목록 조회
	public List<BookRentDTO> findByBuyerCode(String bCode);
	
	// 회원명으로 대여목록 조회
	public List<BookRentDTO> findByBuyerName(String bName);
	
	// 비반납 대여목록 조회
	// (연체자목록)
	public List<BookRentDTO> findByOverDue(String eDate);
	
	// 대여일자를 지정하여 목록조회
	public List<BookRentDTO> findByTerm(String sDate, String eDate);
	
	// Prepare.. 를 통해서 SQL을 실행하면
	// CUR가 정상적으로 수행되면 결과값이 정수 1 이상이 
	// 되돌아 오고
	// 그렇지 못하면 0값이 되돌아 온다
	public int insert(BookRentVO bookRentVO);
	public int update(BookRentVO bookRentVO);
	public int delete(Long seq);

}


