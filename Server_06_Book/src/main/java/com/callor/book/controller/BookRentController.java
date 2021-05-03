package com.callor.book.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.callor.book.model.BookRentVO;
import com.callor.book.service.BookRentService;
import com.callor.book.service.impl.BookRentServiceImplV1;

/*
 * Web Browbser의 Request를 처리할 클래스
 * 
 */
@WebServlet("/rent/*")
public class BookRentController extends HttpServlet{
	
	private static final long serialVersionUID = 921652892464670154L;
	
	protected BookRentService brService;
	public BookRentController() {
		brService = new BookRentServiceImplV1(); // new... 추가하기
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String subPath = req.getPathInfo();
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		if(subPath.equals("/list")) {
			// 도서대여 전체 목록
			brService.selectAll();
			out.println("도서대여 전체목록 보기");
			
		} else if(subPath.equals("/isbn")) {
			// 도서코드로 찾기
			brService.findByBISBN("ibsn");
			
		} else if(subPath.equals("/buyer")) {
			// 회원코드로 찾기
			brService.findByBuyerCode("buyercode");
			
		} else if(subPath.equals("/rent")) {
			// 대여정보 추가, 대여하기
			BookRentVO bookRentVO = new BookRentVO();
			brService.insert(bookRentVO);
			
		} else if(subPath.equals("/return")) {
			// 반납하기
			BookRentVO bookRentVO = new BookRentVO();
			brService.update(bookRentVO);
			
		} else {
			// 더이상 그만하기
		}
	}

}
